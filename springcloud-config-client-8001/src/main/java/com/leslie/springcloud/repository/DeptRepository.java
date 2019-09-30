package com.leslie.springcloud.repository;

import com.leslie.springcloud.entities.Dept;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptRepository extends MongoRepository<Dept,String> {
public Dept findByDeptNo(Long deptNo);
        }
