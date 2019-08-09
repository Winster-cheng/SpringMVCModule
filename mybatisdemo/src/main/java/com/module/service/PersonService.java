package com.module.service;


import com.module.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface PersonService {
    Person findPersonById(long id);
}