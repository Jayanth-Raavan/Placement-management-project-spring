package Technoserve.com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import Technoserve.com.example.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
