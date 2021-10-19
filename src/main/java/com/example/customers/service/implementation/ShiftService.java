package com.example.customers.service.implementation;

import com.example.customers.entity.Shift;
import com.example.customers.mapper.IMapper;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.repository.abstraction.IPageableRepository;
import com.example.customers.service.abstraction.IPageableService;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShiftService implements IPageableService<Shift> {

    private final IPageableRepository<Shift> shiftRepository;

    private final IMapper<Pageable, RowBounds> mapper;

    public ShiftService(IPageableRepository<Shift> shiftRepository, IMapper<Pageable, RowBounds> mapper) {
        this.shiftRepository = shiftRepository;
        this.mapper = mapper;
    }

    @Override
    public Page<Shift> getAllByPageable(Pageable pageable) {
        return shiftRepository.getAllByPage(mapper.map(pageable));
    }
}
