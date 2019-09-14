package com.example.unittest.serviceImpl;

import com.example.unittest.service.EmployeeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EngDepartment implements EmployeeService {

    @Override
    public void getEmployee() {
        System.out.println(" ==== in prod ====");
    }
}
