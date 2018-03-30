package com.mkyong;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demoit.dao")
public class SpringBootWebApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);


	public static void main(String[] args) throws Exception {
		logger.error("sfasdfasdfafdasxx");
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}