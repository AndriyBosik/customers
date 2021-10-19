package com.example.customers.service.implementation;

import com.example.customers.entity.Slip;
import com.example.customers.mapper.IMapper;
import com.example.customers.model.Page;
import com.example.customers.model.Pageable;
import com.example.customers.repository.abstraction.IPageableRepository;
import com.example.customers.service.abstraction.IPageableService;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SlipService implements IPageableService<Slip> {

    private final IPageableRepository<Slip> slipRepository;
    private final IMapper<Pageable, RowBounds> mapper;

    public SlipService(IPageableRepository<Slip> slipRepository, IMapper<Pageable, RowBounds> mapper) {
        this.slipRepository = slipRepository;
        this.mapper = mapper;
    }

    @Override
    public Page<Slip> getAllByPageable(Pageable pageable) {
        return slipRepository.getAllByPage(mapper.map(pageable));
    }
}
