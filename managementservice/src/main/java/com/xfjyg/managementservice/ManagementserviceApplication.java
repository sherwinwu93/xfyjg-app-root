package com.xfjyg.managementservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.xfjyg.managementservice.mapper")
@ComponentScan(value = "com.xfjyg")
public class ManagementserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ManagementserviceApplication.class, args);
	}

}
