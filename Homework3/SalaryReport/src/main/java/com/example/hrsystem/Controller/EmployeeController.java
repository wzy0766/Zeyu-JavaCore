package com.example.hrsystem.Controller;

import com.example.hrsystem.Entity.Employee;
import com.example.hrsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping(value = "/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
    @GetMapping(value="/all")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }
    @PostMapping("/new")
    public void newEmployee(@RequestBody Employee temp){
        service.newEmployee(temp);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody Employee temp) {
        service.updateEmployee(temp);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        service.deleteEmployeeById(id);
    }

}
