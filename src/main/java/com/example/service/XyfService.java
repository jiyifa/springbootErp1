package com.example.service;

import com.example.mapper.XyfMapper;
import com.example.pojo.Depart;
import com.example.pojo.TOrderBillMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XyfService {
    @Autowired
    private XyfMapper xyfMapper;

    public List<Depart> getDeparts(){
        return xyfMapper.selectAllDept();
    }
    public List<TOrderBillMain> selectPurchase(){
        List<TOrderBillMain> tOrderBillMains = this.xyfMapper.selectPurchase();
        return tOrderBillMains;
    }
}
