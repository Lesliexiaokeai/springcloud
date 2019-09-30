package com.leslie.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Dept {
    @Id
    private String id;
    private Long deptNo;
    private String dname;
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }


    public Dept() {
    }

    public Dept setDeptno(Long deptNo) {
        this.deptNo = deptNo;
        return this;
    }

    public Dept setDname(String dname) {
        this.dname = dname;
        return this;
    }

    public Dept setDb_source(String dbSource) {
        this.dbSource = dbSource;
        return this;
    }
}
