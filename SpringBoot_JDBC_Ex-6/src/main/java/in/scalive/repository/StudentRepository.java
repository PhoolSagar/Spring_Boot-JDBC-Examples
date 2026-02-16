package in.scalive.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.scalive.model.Student;

@Repository
public class StudentRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public StudentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void save(Student s) {
		String sql = "Insert into Students values(?,?,?)";
		int count = jdbcTemplate.update(sql, s.getRoll(), s.getName(), s.getPer());
		System.out.println("Record Inserted : "+count);
	}
	
	public List<Student> getAllStudents(){
		String sql = "Select * from students";
		List<Student> stList = jdbcTemplate.query(sql, new MyStudentRowMapper());
		return stList;
	}
	
	
}
