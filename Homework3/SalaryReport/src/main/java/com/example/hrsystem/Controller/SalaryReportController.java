package com.example.hrsystem.Controller;

import com.example.hrsystem.Entity.SalaryReport;
import com.example.hrsystem.Service.SalaryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/salary")
public class SalaryReportController {
    @Autowired
    SalaryReportService service;

    @GetMapping("/get/{job}/{department}")
    public SalaryReport getSalaryReportById(@PathVariable String job,@PathVariable String department){
        return service.getSalaryReportById(job,department);
    }
    @GetMapping("/all")
    public List<SalaryReport> getSalaryReports(){
        return service.getSalaryReports();
    }

}
