package com.example.hrsystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salary_report", schema = "course")
@IdClass(SRId.class)
public class SalaryReport {
    @Id
    private String job;
    @Id
    private String department;
    private double salmin;
    private double salmax;
    private double salavg;
    private double saltotal;
    private int empcount;
    private Date updatetime;
}
