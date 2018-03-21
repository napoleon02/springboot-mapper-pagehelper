package com.etoak.springboot.springbootmapperpagehelper.controller;

import com.etoak.springboot.springbootmapperpagehelper.model.Person;
import com.etoak.springboot.springbootmapperpagehelper.service.PersonService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @program: springboot-mapper-pagehelper
 * @description: 人员控制器CONTROLLER
 * @author: Napoleon
 * @create: 2018-03-21 16:05
 * @version: 0.0.1
 **/
@Controller
@RequestMapping("/person")
public class PersonController {

    @Resource(name = "personService")
    private PersonService personService;

    /**
     * @Description:
     * @Param: [currentPage-当前页, pageSize-每页记录数]
     * @return: java.lang.Object
     * @Author:Napoleon
     * @Date: 2018/3/21
     */
    @RequestMapping("/all")
    @ResponseBody
    public Page<Person> getAllPerson(Integer currentPage, Integer pageSize) {
        Page<Person> allPerson = personService.getAllPerson(currentPage, pageSize);
//        PageInfo info = new PageInfo(allPerson.getResult());
        return allPerson;
    }

}
