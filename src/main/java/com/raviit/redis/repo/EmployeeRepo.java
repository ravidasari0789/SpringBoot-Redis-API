package com.raviit.redis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raviit.redis.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

	
	
}
