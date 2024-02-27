package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class jpaApplication {
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(jpaApplication.class, args);

	}

}
