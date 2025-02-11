package com.Teachers.Teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherApplication {

	public static void main(String[] args)
	{

		System.out.print("Hi teacher");
		SpringApplication.run(TeacherApplication.class, args);
	}

}
