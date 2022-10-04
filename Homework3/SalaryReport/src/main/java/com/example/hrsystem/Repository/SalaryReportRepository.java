package com.example.hrsystem.Repository;

import com.example.hrsystem.Entity.SRId;
import com.example.hrsystem.Entity.SalaryReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryReportRepository extends JpaRepository<SalaryReport, SRId> {
    public SalaryReport findByJobAndDepartment(String job,String department);
}
