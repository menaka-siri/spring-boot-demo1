package com.msiri.springdemo.demo1.api;

import com.msiri.springdemo.demo1.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();

        //TODO: get students from DB
        theStudents.add(new Student("Udara", "Vimukthi", "udara.v@uvlakshan.me"));
        theStudents.add(new Student("Kaeli", "Amelia", "kaeli.a@zealtrack.com"));
        theStudents.add(new Student("Thilanka", "Weera", "thilanka.w@whitehatlk.org"));

        return theStudents;
    }
}