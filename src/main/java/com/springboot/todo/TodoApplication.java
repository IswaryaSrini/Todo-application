package com.springboot.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TodoApplication is the entry point of Todo application using Spring
 * Boot-RestFul-Mongo db
 * 
 * @author isriniva
 *
 */
@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}
