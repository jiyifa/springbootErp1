package com.example.controller;

import com.example.pojo.Depart;
import com.example.pojo.TOrderBillMain;
import com.example.service.XyfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("purchase")
public class XyfController {
    @Autowired
    private XyfService xyfService;
    @RequestMapping("info")
    @ResponseBody
    public Object getCus(){
        List<Object> infos = new ArrayList<Object>();
        List<Map<String,String>> test = new ArrayList<Map<String,String>>();
        System.out.printf("hello");
        Map<String,String> info = new HashMap<String,String>();
        info.put("id","12");
        info.put("name","test");
        Map<String,Object> info1 = new HashMap<String,Object>();
        test.add(info);
        info1.put("data",test);
        infos.add(info1);
        return info1;
    }

    @RequestMapping("getDepart")
    @ResponseBody
    public Object getDepart(){
        List<Depart> departs = this.xyfService.getDeparts();
        Map<String,Object> info = new HashMap<String,Object>();
        info.put("data",departs);
        return info;
    }

    @RequestMapping("getPurchase")
    @ResponseBody
    public Object getPurchase(){
        List<TOrderBillMain> tOrderBillMains = this.xyfService.selectPurchase();
        Map<String,Object> info = new HashMap<String,Object>();
        info.put("data",tOrderBillMains);
        return info;
    }
}
