package com.example.customers.repository.implementation;

import com.example.customers.config.ISessionFactory;
import com.example.customers.mapper.mybatis.ICrudMapper;
import com.example.customers.model.Page;
import com.example.customers.repository.abstraction.IPageFetcher;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PageFetcher implements IPageFetcher {

    private final ISessionFactory sessionFactory;

    public PageFetcher(ISessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public <T> Page<T> getPageData(Class<? extends ICrudMapper<T>> className, RowBounds rowBounds) {
        List<T> items;
        int totalCount;
        try (SqlSession session = sessionFactory.getSessionFactory().openSession()) {
            ICrudMapper<T> mapper = session.getMapper(className);
            items = mapper.getAll(rowBounds);
            totalCount = mapper.getCount();
        }
        return new Page<>(items, totalCount);
    }
}
