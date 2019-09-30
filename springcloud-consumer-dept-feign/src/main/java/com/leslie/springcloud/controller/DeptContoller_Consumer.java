package com.leslie.springcloud.controller;

import com.leslie.springcloud.entities.Dept;
import com.leslie.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptContoller_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptClientService.get(id);

        if (null ==dept){
            throw new RuntimeException("this ID:"+id+" don't exit in database.");
        }
        return dept;
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {

        return deptClientService.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return deptClientService.add(dept);
    }

}
