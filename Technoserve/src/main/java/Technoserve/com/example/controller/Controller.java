package Technoserve.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Technoserve.com.example.entities.Student;
import Technoserve.com.example.service.StudentService;


@RestController
public class Controller {
	@Autowired
	StudentService ss;
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student s)
	{
		ss.addStudent(s);
	}

	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return ss.getStudent(id);
	}
	@PutMapping("/putStudent")
	public void updateStudent(@RequestBody Student s)
	{
		ss.updateStudent(s);
	}
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestBody Student s)
	{
		ss.deleteStudent(s);
	}
}
