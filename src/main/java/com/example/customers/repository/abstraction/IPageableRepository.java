package com.example.customers.repository.abstraction;

import com.example.customers.model.Page;
import org.apache.ibatis.session.RowBounds;

public interface IPageableRepository<T> {

    Page<T> getAllByPage(RowBounds rowBounds);
}
