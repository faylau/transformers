package com.andy.transformers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.andy.transformers.mapper")
public class TransformersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransformersApplication.class, args);
	}
}
