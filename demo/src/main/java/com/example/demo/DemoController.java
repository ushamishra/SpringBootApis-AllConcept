package com.example.demo;


import com.example.demo.pojo.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/v1")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping(path = "/employees")
    ResponseEntity<Map> getEmployees(){
        return new ResponseEntity<>(demoService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping(path = "/createEmployee")
    ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee emp){
        return new ResponseEntity<>(demoService.createEmployee(emp), HttpStatus.OK);
    }

    @PutMapping(path = "/updateOrCreateEmployee")
    ResponseEntity<Employee> updateOrCreateEmployee(@RequestBody Employee emp){
        return new ResponseEntity<>(demoService.updateOrCreateEmployee(emp), HttpStatus.OK);
    }

    @PatchMapping(path = "/updateEmployee")
    ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
        return new ResponseEntity<>(demoService.updateEmployee(emp), HttpStatus.OK);
    }

    @DeleteMapping(path = "deleteEmployee/{empid}")
    ResponseEntity<String> deleteEmployee(@PathVariable int empid){
        return new ResponseEntity<>(demoService.deleteEmployee(empid), HttpStatus.OK);
    }

    @GetMapping(path = "findEmployee/{empid}")
    ResponseEntity<Employee> findEmployee(@PathVariable int empid){
        return new ResponseEntity<>(demoService.findEmployee(empid), HttpStatus.OK);
    }
}
