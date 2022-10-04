package com.example.hrsystem.Service;

import com.example.hrsystem.Entity.Employee;
import com.example.hrsystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }
    public List<Employee> getEmployees(){
        return repo.findAll();
    }
    public void updateEmployee(Employee temp) {
        Employee exist = repo.findById(temp.getEmpid()).orElse(null);
        exist.setName(temp.getName());
        exist.setJob(temp.getJob());
        exist.setManager(temp.getManager());
        exist.setHiredate(temp.getHiredate());
        exist.setSalary(temp.getSalary());
        exist.setDeptid(temp.getDeptid());
        repo.save(exist);

    }
    public void newEmployee(Employee temp) {
        repo.save(temp);
    }
    public void deleteEmployeeById(int id) {
        repo.deleteById(id);
    }
}
