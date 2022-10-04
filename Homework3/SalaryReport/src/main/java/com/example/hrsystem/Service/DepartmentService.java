package com.example.hrsystem.Service;

import com.example.hrsystem.Entity.Department;
import com.example.hrsystem.Entity.Employee;
import com.example.hrsystem.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department getDepartmentById(int id) {
        return repo.findById(id).orElse(null);
    }
    public List<Department> getDepartments(){
        return repo.findAll();
    }
    public void updateDepartment(Department temp) {
        Department exist = repo.findById(temp.getDeptid()).orElse(null);
        exist.setName(temp.getName());
        exist.setLoc(temp.getLoc());
        repo.save(exist);

    }
    public void newDepartment(Department temp) {
        repo.save(temp);
    }
    public void deleteDepartmentById(int id) {
        repo.deleteById(id);
    }
}
