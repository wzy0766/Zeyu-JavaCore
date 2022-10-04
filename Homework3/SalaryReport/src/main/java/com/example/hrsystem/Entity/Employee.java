package com.example.hrsystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee", schema = "course")
public class Employee {
    @Id
    public int empid;
    public String name;
    public String job;
    public int manager;
    public Date hiredate;
    public double salary;
    public int deptid;
}
