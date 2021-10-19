package com.example.customers.service.implementation;

import com.example.customers.entity.Customer;
import com.example.customers.mapper.IMapper;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.repository.abstraction.IPageableRepository;
import com.example.customers.service.abstraction.IPageableService;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerService implements IPageableService<Customer> {

    private final IPageableRepository<Customer> customerRepository;
    private final IMapper<Pageable, RowBounds> mapper;

    public CustomerService(IPageableRepository<Customer> customerRepository, IMapper<Pageable, RowBounds> mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    @Override
    public Page<Customer> getAllByPageable(Pageable pageable) {
        return customerRepository.getAllByPage(mapper.map(pageable));
    }
}
