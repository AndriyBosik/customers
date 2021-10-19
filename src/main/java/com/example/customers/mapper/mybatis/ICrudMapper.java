package com.example.customers.mapper.mybatis;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ICrudMapper<T> {

    List<T> getAll(RowBounds rowBounds);

    Integer getCount();
}
