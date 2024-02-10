package com.raviit.redis.entity;

import org.springframework.data.redis.core.RedisHash;



@RedisHash("employee")
public class Employee {

	           private int id;
	           
	           private String name;
	           
	           private String address;
	           
	           private String phno;
	           
	           public Employee() {
	        	   
	           }

			public Employee(int id, String name, String address, String phno) {
				super();
				this.id = id;
				this.name = name;
				this.address = address;
				this.phno = phno;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getPhno() {
				return phno;
			}

			public void setPhno(String phno) {
				this.phno = phno;
			}

			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phno=" + phno + "]";
			}
	           
}
