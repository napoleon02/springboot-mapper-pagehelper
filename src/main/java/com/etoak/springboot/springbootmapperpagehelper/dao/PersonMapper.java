package com.etoak.springboot.springbootmapperpagehelper.dao;

import com.etoak.springboot.springbootmapperpagehelper.model.Person;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface PersonMapper extends Mapper<Person> {
}