package com.etoak.springboot.springbootmapperpagehelper.service;

import com.etoak.springboot.springbootmapperpagehelper.model.Person;
import com.github.pagehelper.Page;

/**
 * @program: springboot-mapper-pagehelper
 * @description: 人员API
 * @author: Napoleon
 * @create: 2018-03-21 16:06
 * @version: 0.0.1
 **/
public interface PersonService {

    /**
     * @Description: 查询所有的人员
     * @Param: null
     * @return: 系统所有人员
     * @Author:Napoleon
     * @Date: 2018/3/21
     */
    Page<Person> getAllPerson(Integer currentPage, Integer pageSize);
}
