package com.example.employeemanagement.DAO;

import com.example.employeemanagement.Model.Employee;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class EmployeeRepository {
    static List<Employee> employees;

    static {
        employees = new ArrayList<>();

        employees.add(new Employee(0,"Smith","Software Developer","2022-09-13",1,9000.00));
        employees.add(new Employee(1,"Robert","IT Wroker","2015-01-23",1,6900.00));
        employees.add(new Employee(2,"Peter","Manager","2013-07-24",1,12500.00));
        employees.add(new Employee(3,"Jackson","Intern","2022-10-03",1,4500.00));
        employees.add(new Employee(4,"Cathy","HR","2019-05-14",1,6000.00));
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee getEmployeeById(int id){
        return employees.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }

    public void updateEmployee(int id, Employee temp){
        Employee target = this.getEmployeeById(id);
        target.setName(temp.getName());
    }

    public void updateEmployee(Employee temp){
        Employee target = employees.stream().filter(e -> temp.getId() == e.getId()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }

    public void newEmployee(Employee temp){
        //temp should not exist already in employees -- sanity check
        int maxId = employees.stream().mapToInt(e -> e.getId()).max().getAsInt();
        temp.setId(maxId + 1);
        employees.add(temp);
    }

    public void deleteEmployeeById(int id){
        Iterator<Employee> it = employees.iterator();
        while(it.hasNext()){
            Employee temp = it.next();
            if(id == temp.getId()){
                it.remove();
            }
        }
    }

    public void deleteAllEmployees(){
        //  employees = new ArrayList<>();
        employees.clear();
    }
}
