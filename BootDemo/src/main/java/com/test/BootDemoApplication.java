package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.test.dao")
@EnableSwagger2   // 使swagger2生效
public class BootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}
//http://localhost:8999/hello/insert.do?username=%E6%B5%8B%E8%AF%95&password=1234&classid=2