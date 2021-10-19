package com.example.customers.config;

import org.apache.ibatis.session.SqlSessionFactory;

public interface ISessionFactory {

    SqlSessionFactory getSessionFactory();
}
