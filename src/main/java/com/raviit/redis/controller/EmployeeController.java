package com.raviit.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raviit.redis.entity.Employee;
import com.raviit.redis.service.EmployeeService;

@RestController
public class EmployeeController {

	              @Autowired
	              private EmployeeService empservice;
	              @PostMapping("/saveemployee")
	              public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
	            	  
	            	Employee employee=empservice.saveEmployee(emp);
	            	  return new ResponseEntity<>(employee,HttpStatus.ACCEPTED);
	              }
	              
	              @GetMapping("/getemployee")
	              public ResponseEntity<List<Employee>> getallEmployee(){
	            	  List<Employee> allEmployee = empservice.getAllEmployee();
	            	  return new ResponseEntity<>(allEmployee,HttpStatus.OK);
	              }
}
