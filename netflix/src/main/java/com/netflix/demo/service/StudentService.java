
package com.netflix.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.netflix.demo.model.Student;
import com.netflix.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studRepository;
	public List<Student> getAllStudent()
    {
    	List<Student> studList= studRepository.findAll();
    	return studList;
    }
	public Student saveStudent(Student s) {
		Student obj = studRepository.save(s);
		return obj;
		
	}
	public Student updateStudent(Student s) {
		Student obj = studRepository.save(s);
		return obj;
	}
	public void deleteStudent(int regno)
	{
		studRepository.deleteById(regno);
	}
	public Student getStudent(int regno)
	{
		Student s =studRepository.findById(regno).get();
		return s;
	}
}
