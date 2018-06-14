package com.example.service;



import com.example.pojo.TestName;
import com.example.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/3/14.
 */
@Service
public class EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<TestName> selectAll(){
        return employeeMapper.selectAll();
    }
}
