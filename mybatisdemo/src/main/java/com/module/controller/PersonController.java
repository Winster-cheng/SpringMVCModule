package com.module.controller;

import com.module.entity.Person;
import com.module.service.PersonService;
import com.module.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: peilongcheng
 * @Date: 2019/7/16 16:33
 * @Description:
 */

@Controller
@RequestMapping("/person")
public class PersonController {

//    @Autowired
    private PersonService personService=new PersonServiceImpl();
    @RequestMapping("/selectPerson")
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        long personId = Long.parseLong(request.getParameter("id"));
        Person person =personService.findPersonById(personId);

        response.getWriter().write(person.toString());
        response.getWriter().close();
    }
}