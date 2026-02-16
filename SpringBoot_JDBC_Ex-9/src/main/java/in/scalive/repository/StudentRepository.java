package in.scalive.repository;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class StudentRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public StudentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void save() {
		String sql1 = "Insert into Students values(101,'Phoolsagar', 99.9)";
		String sql2 = "Insert into Students values(102,'Manu', 89.9)";
		String sql3 = "Insert into Students values(103,'Bittu', 79)";
		
		int[] result = jdbcTemplate.batchUpdate(sql1, sql2, sql3);
		for(int x : result) {
			System.out.println("Rec insterted : "+x);
		}
	}
	
	
	
	
}
