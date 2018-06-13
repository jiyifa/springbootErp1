package com.example.mapper;


import com.example.entity.TestName;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public  interface EmployeeMapper {
   /* @Select("select * from name")*/
    List<TestName> selectAll();

}
