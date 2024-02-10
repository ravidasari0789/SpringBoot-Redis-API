package com.raviit.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raviit.redis.entity.Employee;
import com.raviit.redis.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	            @Autowired
	            private EmployeeRepo emprepo;
	            
	            public Employee saveEmployee(Employee emp) {
	            	
	            	return emprepo.save(emp);
	            }
	            
	            public List<Employee> getAllEmployee(){
	            	
	            List<Employee> emp=	(List<Employee>) emprepo.findAll();
	                     return emp;
	            }
}
