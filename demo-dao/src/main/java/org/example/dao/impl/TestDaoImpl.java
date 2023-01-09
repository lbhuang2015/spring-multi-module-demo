package org.example.dao.impl;

import org.example.dao.TestDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {
    @Value("${dao.property}")
    private String property1;

    @Override
    public String testDao(String name){
        return name+":"+property1;
    }

}
