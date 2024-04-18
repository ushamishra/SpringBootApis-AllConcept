package com.example.demo;

import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public Map<Integer,Employee> getEmployees() {

        return demoRepository.getEmployees();
    }

    public Employee createEmployee(Employee emp) {

        return demoRepository.createEmployee(emp);
    }

    public Employee updateOrCreateEmployee(Employee emp) {
        return demoRepository.updateOrCreateEmployee(emp);
    }

    public Employee updateEmployee(Employee emp) {
        return demoRepository.updateEmployee(emp);
    }

    public String deleteEmployee(int empid) {
        return demoRepository.deleteEmployee(empid);
    }

    public Employee findEmployee(int empid) {
        return demoRepository.findEmployee(empid);
    }
}
