package com.msiri.springdemo.demo1;

import com.msiri.springdemo.demo1.dao.StudentDAO;
import com.msiri.springdemo.demo1.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

/*
@SpringBootApplication (
		scanBasePackages = {
				"com.msiri.springdemo.demo1",
				"util"
		}
) */

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//System.out.println("Hello World");
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Menaka", "Sirisena", "menaka442@zealtrack.com");

		System.out.println("Saving the student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student, generated ID: " + tempStudent.getId());
	}
}
