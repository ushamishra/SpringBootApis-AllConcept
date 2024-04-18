package com.example.demo.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

@Validated
public class Employee {
    @NotEmpty
    @Min(value =3,message="Minimum of 3 characters")
    private String name;

    @Positive
    private int eNo;

    @NotEmpty
    @Min(value =3,message="Minimum of 3 characters")
    private String dept;

    public Employee(String name, int eNo, String dept) {
        this.name = name;
        this.eNo = eNo;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geteNo() {
        return eNo;
    }

    public void seteNo(int eNo) {
        this.eNo = eNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
