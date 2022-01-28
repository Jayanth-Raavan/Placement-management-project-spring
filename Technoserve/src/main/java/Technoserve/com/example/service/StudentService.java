package Technoserve.com.example.service;

import Technoserve.com.example.entities.Student;

public interface StudentService {
	public void addStudent(Student s);

	public <College> void addCollege(College c);
	public Student getStudent(int id);
	public void updateStudent(Student s);
	public void deleteStudent(Student s);

}
