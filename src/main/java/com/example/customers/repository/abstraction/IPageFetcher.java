package com.example.customers.repository.abstraction;

import com.example.customers.mapper.mybatis.ICrudMapper;
import com.example.customers.model.Page;
import org.apache.ibatis.session.RowBounds;

public interface IPageFetcher {

    <T> Page<T> getPageData(Class<? extends ICrudMapper<T>> className, RowBounds rowBounds);
}
