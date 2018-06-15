package com.example.mapper;


import com.example.pojo.Depart;
import com.example.pojo.TOrderBillMain;

import java.util.List;

public interface XyfMapper {
    public List<Depart> selectAllDept();
    public List<TOrderBillMain> selectPurchase();
}
