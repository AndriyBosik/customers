package com.example.customers.repository.implementation;

import com.example.customers.entity.Customer;
import com.example.customers.mapper.mybatis.ICustomerMapper;
import com.example.customers.model.Page;
import com.example.customers.repository.abstraction.IPageFetcher;
import com.example.customers.repository.abstraction.IPageableRepository;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements IPageableRepository<Customer> {

    private final IPageFetcher pageFetcher;

    public CustomerRepository(IPageFetcher pageFetcher) {
        this.pageFetcher = pageFetcher;
    }

    @Override
    public Page<Customer> getAllByPage(RowBounds rowBounds) {
        return pageFetcher.getPageData(ICustomerMapper.class, rowBounds);
    }
}
