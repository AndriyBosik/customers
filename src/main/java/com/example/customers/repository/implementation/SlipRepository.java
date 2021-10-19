package com.example.customers.repository.implementation;

import com.example.customers.entity.Slip;
import com.example.customers.mapper.mybatis.ISlipMapper;
import com.example.customers.model.Page;
import com.example.customers.repository.abstraction.IPageFetcher;
import com.example.customers.repository.abstraction.IPageableRepository;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SlipRepository implements IPageableRepository<Slip> {

    private final IPageFetcher pageFetcher;

    public SlipRepository(IPageFetcher pageFetcher) {
        this.pageFetcher = pageFetcher;
    }

    @Override
    public Page<Slip> getAllByPage(RowBounds rowBounds) {
        return pageFetcher.getPageData(ISlipMapper.class, rowBounds);
    }
}
