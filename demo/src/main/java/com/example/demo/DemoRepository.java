package com.example.demo;

import com.example.demo.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DemoRepository {


    static Map<Integer,Employee> hashMap = new HashMap<> ();

    DemoRepository() {
        hashMap.put(1,new Employee("Usha",1,"Research"));
        hashMap.put(2,new Employee("Sudha",2,"Education"));
        hashMap.put(3,new Employee("Sanjay",3,"Health"));
        hashMap.put(4,new Employee("Aiswarya",4,"Health"));
        hashMap.put(5,new Employee("Prachurya",5,"Admin"));
        hashMap.put(6,new Employee("Sudhanya",6,"Entertainment"));

    }
    public Map<Integer,Employee> getEmployees() {

        return hashMap;
    }

    public Employee createEmployee(Employee emp) {


        emp.seteNo(hashMap.size()+1);
        hashMap.put(hashMap.size()+1,emp);
        return emp;
    }

    public Employee updateOrCreateEmployee(Employee emp) {

       Employee employee  =  hashMap.get(emp.geteNo());
       if(employee != null){
           updateEmployee(emp);
       }else {

           createEmployee(emp);
       }

       return emp;

    }

    public Employee updateEmployee(Employee emp) {

        Employee employee = hashMap.get(emp.geteNo());
        employee.setName(emp.getName());
        employee.seteNo(emp.geteNo());
        employee.setDept(emp.getDept());
        return employee;

    }

    public String deleteEmployee(int empid) {
        hashMap.remove(empid);
        return "Employee has been removed";
    }

    public Employee findEmployee(int empid) {
        return hashMap.get(empid);
    }
}
