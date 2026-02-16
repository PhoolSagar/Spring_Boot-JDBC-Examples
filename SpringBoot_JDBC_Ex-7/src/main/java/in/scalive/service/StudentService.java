package in.scalive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.scalive.model.Student;
import in.scalive.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}

	public void save(Student s) {
		repo.save(s);
	}
	
	public List<Student> getAllStudents(){
		
		List<Student> stList = repo.getAllStudents();
		return stList;
	}
	
	
}
