package com.netflix.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.demo.model.Student;
import com.netflix.demo.service.StudentService;

@RestController
public class StudentContoller {
	@Autowired
	StudentService studService;
    @GetMapping("/fetchStudent")
    public List<Student> getAllStudents()
    {
    	List<Student> studList= studService.getAllStudent();
    	return studList;
    }
    //http://localhost:8080/saveStudent
    @PostMapping(value="/saveStudent")
    public Student saveStudent(@RequestBody Student s)
    {
    	return studService.saveStudent(s);
    }
    @PutMapping(value="/updateStudent/{rno}")
    public Student updateStudent(@RequestBody Student s, @PathVariable("rno") int regno)
    {
    	return studService.updateStudent(s,regno);
    }
    @DeleteMapping(value="/deleteStudent/{rno}")
    public void deleteStudent(@PathVariable("rno") int regno)
    {
    	studService.deleteStudent(regno);
    }
    @GetMapping(value="/getStudent/{rno}")
    public Student getStudent(@PathVariable("rno") int regno)
    {
    	return studService.getStudent(regno);
    }
    
    @GetMapping("/sortStudent/{name}")
    public List<Student> sortStudents(@PathVariable("name") String name)
    {
    	return studService.sortStudents(name);
    }
    @GetMapping("pagination/{nm}/{sp}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return studService.paginate(num,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return studService.paginate(num,size,name);
	}
	@GetMapping("/fetchPrefix")
	public List<Student> fetchStudentByNamePrefix(@RequestParam String prefix)
	{
		return studService.fetchStudentByNamePrefix(prefix);
	}
	@GetMapping("/fetchSuffix")
	public List<Student> fetchStudentByNameSuffix(@RequestParam String suffix)
	{
		return studService.fetchStudentByNameSuffix(suffix);
	}
	@GetMapping("/fetchByDept")
	public List<Student> fetchStudentByDept(@RequestParam String dept)
	{
		return studService.fetchStudentByDept(dept);
	}
	@DeleteMapping("/deleteStudentByName/{name}")
    public String deleteStudentByName(@PathVariable String name)
    {
 	   int result = studService.deleteStudentByName(name);
 	   if(result>0)
 		     return "Student record deleted";
 	   else
 		     return "Problem occured while deleting";
    }
    @PutMapping("/updateStudentByName/{dept}/{name}")
    public String updateStudentByName(@PathVariable String dept,String name)
    {
 	   int res = studService.updateStudentByName(dept, name);
 	   if(res>0)
 		      return "Student record updated";
 	   else
 		    return "Problem occured";
    }

    
}
