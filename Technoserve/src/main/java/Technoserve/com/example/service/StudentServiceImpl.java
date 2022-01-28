package Technoserve.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Technoserve.com.example.entities.Student;
import Technoserve.com.example.repo.StudentRepo;

@Service //It will create an object for this class
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;
	
	@Override
	public void addStudent(Student s) {
		sr.save(s);
	}

	@Override
	public <College> void addCollege(College c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int id) {
		return sr.findById(id).get();
		
	}

	@Override
	public void updateStudent(Student s) {
		sr.save(s);
	}

	@Override
	public void deleteStudent(Student s) {
		sr.save(s);
	}

}
