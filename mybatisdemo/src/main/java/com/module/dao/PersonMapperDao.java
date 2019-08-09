package com.module.dao;

/**
 * @Auther: peilongcheng
 * @Date: 2019/7/16 16:34
 * @Description:
 */

import com.module.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapperDao {
    Person findPersonById(long id);
}