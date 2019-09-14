package com.example.unittest.Controllers;

import com.example.unittest.service.EmployeeService;
import com.example.unittest.serviceImpl.EngDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController  {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/indevemployee")
    public void getDev() {
        employeeService.getEmployee();
    }


    @GetMapping("/inprodemployee")
    public void getProdEmployee() {
        employeeService.getEmployee();;
    }
}
