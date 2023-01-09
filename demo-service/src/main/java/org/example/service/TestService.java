package org.example.service;

import org.example.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;


    @Value("${service.property}")
    private String property1;

    public String testService(String name){
        return testDao.testDao(name)+" : "+property1+"";
    }




}
