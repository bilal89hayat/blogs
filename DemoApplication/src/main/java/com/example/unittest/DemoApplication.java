package com.example.unittest;

import com.example.unittest.model.EmployeeBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		EmployeeBuilder emp_1 = new EmployeeBuilder.Builder().withEid(1).build();

		System.out.println("=========  emp_1 contains :" + emp_1.toString());

		emp_1 = new EmployeeBuilder.Builder()
				                   .withEid(1)
				                   .withFirstname("Builder pattern")
				                   .build();

		System.out.println("=========  emp_1 contains :" + emp_1.toString());

		emp_1 = new EmployeeBuilder.Builder()
				.withEid(1)
				.withFirstname("Builder pattern")
				.withlastName("Third Object")
				.build();

		System.out.println("=========  emp_1 contains :" + emp_1.toString());



	}




}
