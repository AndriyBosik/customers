package com.example.customers.mapper;

import com.example.customers.model.Pageable;
import org.apache.ibatis.session.RowBounds;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PageableToRowBoundsMapper implements IMapper<Pageable, RowBounds> {

    @Override
    public RowBounds map(Pageable model) {
        return new RowBounds(
            (model.getPageNumber() - 1)*model.getItemsCount(),
            model.getItemsCount()
        );
    }
}
