package com.msiri.springdemo.demo1.dao;

import com.msiri.springdemo.demo1.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
}
