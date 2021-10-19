package com.example.customers.repository.implementation;

import com.example.customers.entity.Shift;
import com.example.customers.mapper.mybatis.IShiftMapper;
import com.example.customers.model.Page;
import com.example.customers.repository.abstraction.IPageFetcher;
import com.example.customers.repository.abstraction.IPageableRepository;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShiftRepository implements IPageableRepository<Shift> {

    private final IPageFetcher pageFetcher;

    public ShiftRepository(IPageFetcher pageFetcher) {
        this.pageFetcher = pageFetcher;
    }

    @Override
    public Page<Shift> getAllByPage(RowBounds rowBounds) {
        return pageFetcher.getPageData(IShiftMapper.class, rowBounds);
    }
}
