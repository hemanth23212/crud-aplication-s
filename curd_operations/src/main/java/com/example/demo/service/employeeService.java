package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.employee;
import com.example.demo.repository.employeeRepo;
@Service
public class employeeService{
   @Autowired
    private employeeRepo employeeRepo;
    // CURT
   // Create
    public employee saveemployee(employee e){
        return employeeRepo.save(e);
   }
    public String updateemployee(employee e){
   Optional employee>employee=employeeRepo.findById(e.getId());
    employee.get().setsalary(e.getsalary());
    employeeRepo.save(e);
    return employee saved successy with ID "+employee.get().getId();"
    

// Read
public employee reademployee(Integer id){
   Optional<employee>product=employeeRepo.findById(id);
    return product.get();
    }
// Delete
public String deleteemployee(Integer id){
    employeeRepo.deleteById(id);
    return"employee deleted:"+id;
    
}
}