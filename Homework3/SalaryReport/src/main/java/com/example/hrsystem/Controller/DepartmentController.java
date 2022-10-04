package com.example.hrsystem.Controller;

import com.example.hrsystem.Entity.Department;
import com.example.hrsystem.Entity.Employee;
import com.example.hrsystem.Service.DepartmentService;
import com.example.hrsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping(value = "/get/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }
    @GetMapping(value="/all")
    public List<Department> getDepartments(){
        return service.getDepartments();
    }
    @PostMapping("/new")
    public void newDepartment(@RequestBody Department temp){
        service.newDepartment(temp);
    }
    @PutMapping("/update")
    public void updateDepartment(@RequestBody Department temp) {
        service.updateDepartment(temp);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        service.deleteDepartmentById(id);
    }
}
