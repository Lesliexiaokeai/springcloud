package com.leslie.sprincloud.service;

import com.leslie.sprincloud.repository.DeptRepository;
import com.leslie.springcloud.entities.Dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptRepository deptRepository;

    public Dept get(Long id){
        return  deptRepository.findByDeptNo(id);
    }

    public List<Dept> list(){
        return deptRepository.findAll();
    }

    public void add(Dept dept){
        deptRepository.save(dept);
    }
}
