package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class DemoResttApplication {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
		
		
	public static void main(String[] args) {
		System.out.println("Tutorials project...");
		SpringApplication.run(DemoResttApplication.class, args);		
	}
	
		
}
