package com.xue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xue.repository.dao")
public class SpringsecurityUserRoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityUserRoleApplication.class, args);
	}

}
