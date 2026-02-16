package in.scalive.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.scalive.model.Student;

public class MyStudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setRoll(rs.getInt("roll"));
		s.setName(rs.getString("name"));
		s.setPer(rs.getDouble("per"));
		return s;
	}

	

}
