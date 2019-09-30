package com.leslie.sprincloud.repository;

import com.leslie.springcloud.entities.Dept;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptRepository2 extends MongoRepository<Dept,String> {
    public Dept findByDeptNo(Long deptNo);
}
