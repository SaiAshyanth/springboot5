
package com.netflix.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.netflix.demo.model.Student;
import com.netflix.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;

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
	public  Student updateStudent(Student s,int regno) {
		Optional<Student> optional=studRepository.findById(regno);
		Student obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
//			obj.setRegno(s.getRegno());
//			obj.setName(s.getName());
//			obj.setDept(s.getDept());
//			obj.setMail(s.getMail());
		studRepository.save(s);
		}
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
	public List<Student> sortStudents(String name) 
	{
	    return studRepository.findAll(Sort.by(name));
	}
	public List<Student> paginate(int num, int size) 
	{
		Page<Student> p=studRepository.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	public List<Student> paginate(int num, int size, String price) 
	{
		Page<Student> obj=studRepository.findAll(PageRequest.of(num, size,Sort.by(price).descending()));
		return obj.getContent();
	}
	public List<Student> fetchStudentByNamePrefix(String prefix)
	{
		return studRepository.findByNameStartingWith(prefix);
	}
	public List<Student> fetchStudentByNameSuffix(String suffix)
	{
		return studRepository.findByNameEndingWith(suffix);
	}
	public List<Student> fetchStudentByDept(String dept)
	{
		return studRepository.findByDept(dept);
	}
	public List<Student> getStudentsByDept(String dept,String name)
	  {
		  return studRepository.getStudentsByDept(dept, name);
	  }
	@Transactional 
	public int deleteStudentByName(String name)
	{
     	return studRepository.deleteStudentByName(name);
	}
	@Transactional
	public int updateStudentByName(String dept,String name)
	{
		return studRepository.updateStudentByName(dept, name);
	}
}
