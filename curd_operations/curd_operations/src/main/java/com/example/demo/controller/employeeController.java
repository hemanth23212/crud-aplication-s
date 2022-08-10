package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.employee;
import com.example.demo.service.employeeService;
@RestController
@RequestMapping("/api")
public class employeeController{
    @Autowired
    private employeeService employeeService;
    @PostMapping("addemployee")
public employee saveemployee(@RequestBody employee e){
    return employeeService.saveemployee(e);
}
@PostMapping("addAllemployee")
public String saveAllemployee(@RequestBody List<employee>employee){
    return employeeService.saveAllemployee(employee);
}
@PutMapping("/updateByPrice")
public employee updateemployee(@RequestBody employee e){
    return employeeService.updateemployee(e);
}
@DeleteMapping("/deleteById/{pId}")
public String deleteemployeeById(@PathVariable Integer eId){
    return employeeService.deleteemployee(eId);
}
}