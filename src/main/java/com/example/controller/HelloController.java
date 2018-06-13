package com.example.controller;


import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/3/14.
 */
@Controller
//@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("/sele")
    public Object SelectAll(){
        return employeeService.selectAll();
    }

}
