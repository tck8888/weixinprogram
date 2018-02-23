package com.tck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tck.dao")
public class WeixinprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeixinprogramApplication.class, args);
	}
}
