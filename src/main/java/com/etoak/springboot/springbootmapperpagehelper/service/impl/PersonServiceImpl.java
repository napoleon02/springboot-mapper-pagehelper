package com.etoak.springboot.springbootmapperpagehelper.service.impl;

import com.etoak.springboot.springbootmapperpagehelper.dao.PersonMapper;
import com.etoak.springboot.springbootmapperpagehelper.model.Person;
import com.etoak.springboot.springbootmapperpagehelper.service.PersonService;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-mapper-pagehelper
 * @description: 人员接口实现类
 * @author: Napoleon
 * @create: 2018-03-21 16:08
 * @version: 0.0.1
 **/
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;


    /**
     * @Description:
     * @Param: [currentPage, pageSize]
     * @return: com.github.pagehelper.Page<com.etoak.springboot.springbootmapperpagehelper.model.Person>
     * @Author:Napoleon
     * @Date: 2018/3/21
     */
    @Override
    public Page<Person> getAllPerson(Integer currentPage, Integer pageSize) {
        Page<Person> objects = PageHelper.startPage(currentPage, pageSize).doSelectPage(new ISelect() {
            @Override
            public void doSelect() {
                personMapper.selectAll();
            }
        });
        return objects;
    }
}
