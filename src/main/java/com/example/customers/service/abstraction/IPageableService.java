package com.example.customers.service.abstraction;

import com.example.customers.model.Page;
import com.example.customers.model.Pageable;

public interface IPageableService<T> {

    Page<T> getAllByPageable(Pageable pageable);
}
