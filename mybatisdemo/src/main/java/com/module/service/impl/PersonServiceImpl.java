package com.module.service.impl;

import com.module.dao.PersonMapperDao;
import com.module.entity.Person;
import com.module.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapperDao personMapperDao;
    public Person findPersonById(long id) {
        return personMapperDao.findPersonById(id);
    }
}