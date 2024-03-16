package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class JPAApplication {
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(JPAApplication.class, args);

	}

}
