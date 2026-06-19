
package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.dao.EmployeeDao;
import com.model.Employee;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    
    @GetMapping("/")
    public String home() {
        return "index";
    }


    @PostMapping("/save")
    @ResponseBody
    public String save(Employee employee) {

        dao.save(employee);

        return "success";
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(Employee employee) {

        dao.update(employee);

        return "success";
    }

    @PostMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") int id) {

        dao.delete(id);

        return "success";
    }
    
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Controller Working";
    }
}