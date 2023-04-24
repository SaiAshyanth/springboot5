package com.netflix.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.demo.model.Student;
import com.netflix.demo.service.StudentService;

@RestController
public class StudentContoller {
	@Autowired
	StudentService studService;
    @GetMapping("/student")
    public List<Student> getAllStudents()
    {
    	List<Student> studList= studService.getAllStudent();
    	return studList;
    }
    //http://localhost:9080/saveStudent
    @PostMapping(value="/saveStudent")
    public Student saveStudent(@RequestBody Student s)
    {
    	return studService.saveStudent(s);
    }
}
