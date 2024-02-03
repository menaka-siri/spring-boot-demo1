package com.msiri.springdemo.demo1;

import com.msiri.springdemo.demo1.dao.StudentDAO;
import com.msiri.springdemo.demo1.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.List;

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
//			System.out.println("Hello World");
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student ...");
		myStudent.setFirstName("Lahiru");

		studentDAO.update(myStudent);
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theList = studentDAO.findByLastName("Sirisena");
		for (Student tempStudent: theList) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Udara", "Vimukthi", "udara.m@zealtrack.com");

		System.out.println("Saving the student object ...");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved student, generated ID: " + theId);

		System.out.println("Retrieving student, with ID: " +  theId);
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Display student: " + myStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Menaka", "Sirisena", "menaka442@zealtrack.com");

		System.out.println("Saving the student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student, generated ID: " + tempStudent.getId());
	}
}
