package training.spring.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper  implements RowMapper<Student>{


	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) 
			throws SQLException {

		Student student = new Student(); 
		
		student.setStudentId(rs.getInt("studentid"));
		student.setStudentName(rs.getString("studentname").toUpperCase());
		student.setMarks(rs.getInt("studentmarks"));
		student.setStudentAge(rs.getInt("studentage"));
		
		return student; 
	}
		
}
