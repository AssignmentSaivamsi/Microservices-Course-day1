package net.springboot.controller;

import org.springframework.web.bind.annotation.RestController;

import net.springboot.bean.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class StudentController {
	
@GetMapping("Student")
public Student getStudent() {
	
	Student student = new Student();
		    student.setId(1);
		    student.setfirstName("Sai");
		    student.setlastName("Vamsi");
				
	return student;
			
}
@GetMapping("Students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		int id;
		String firstName;
		students.add(new Student(id:1, firstName: "Sai", lastName: "Vamsi"));
		students.add(new Student(id:1, firstName: "Deva", lastName: "Kiran"));
		students.add(new Student(id:1, firstName: "Krishna", lastName: "Vinod"));
		students.add(new Student(id:1, firstName: "Sanjay", lastName: "Venkat"));
		return students;
		
	}
//Springboot Rest API with PathVariable
@GetMapping("students/{id}{/first-name}/{/last-name}")
public Student studentPathVariable(@PathVariable("id") int studentId),
                                    @PathVariable("first-name") String firstName,
                                    @PathVariable("last-name") String lastName){
                                    	
	return new Student(studentId, firstName, lastName);
	
	//Springboot Rest API With RequestParam
	@GetMapping("Students/query")
	public Student studentRequestVariable(@RequestParam int id,
			                              @RequestParam String firstName,
			                              @RequestParam String lastName) {
		return new Student(id, firstName, lastName);
	}
	


	
}


