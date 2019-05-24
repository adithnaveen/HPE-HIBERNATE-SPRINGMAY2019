package training.spring.db;

import java.util.List;

public interface StudentDAO {
	
	public void setDataSource(javax.sql.DataSource ds); 
	
	public Student getStudent(int studentId); 
	public void inserteStudent(Student student); 
	public List<Student> listStudents();
	public void deleteStudent(int studentId); 
	public void updateStudent(int studentId, int marks); 
	
	
}
