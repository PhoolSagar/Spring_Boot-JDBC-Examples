package in.scalive.service;

import java.util.List;

import org.springframework.stereotype.Service;


import in.scalive.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}

	public void save() {
		repo.save();
	}
	
	
	
	
}
