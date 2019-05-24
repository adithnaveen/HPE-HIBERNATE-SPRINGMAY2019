package training.spring.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate  implements StudentDAO{

	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplate; 
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; 
		
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}

	@Override
	public Student getStudent(int studentId) {
		String sql ="select * from student where studentid = ?";
		/*Student student = jdbcTemplate.queryForObject
			(sql, new Object[] {studentId}, 
				new BeanPropertyRowMapper<Student>
				(Student.class)); */
	
		
		Student student = 
				jdbcTemplate.queryForObject
				(sql, new Object[] {studentId}, 
					new StudentMapper()); 
		
		return student; 
	}

	@Override
	public void inserteStudent(Student student) {
		String sql="insert into student values(?,?,?,?)";
		this.jdbcTemplate.update(sql, 
				student.getStudentId(), 
				student.getStudentName(), 
				student.getStudentAge(), 
				student.getMarks());
		
		
	}

	@Override
	public List<Student> listStudents() {
		String sql ="select * from student"; 
		
		List<Student> students = jdbcTemplate.query(sql, 
				new StudentMapper()	); 
		
		return students; 

	}

	@Override
	public void deleteStudent(int studentId) {
		String sql ="delete from student where studentid =?";
		
		jdbcTemplate.update(sql, studentId); 
//		jdbcTemplate.update(sql, new Object[] {studentId}); 
		
		System.out.println("Record Deleted With Id " + studentId);
		
		return; 
	}

	@Override
	public void updateStudent(int studentId, int marks) {
		
		String sql ="update student set studentmarks = ? where studentid=?";
		
		jdbcTemplate.update(sql, marks, studentId); 
		System.out.println("Student Update and Below is the details ");
		System.out.println(this.getStudent(studentId));
		
	}
	
}
