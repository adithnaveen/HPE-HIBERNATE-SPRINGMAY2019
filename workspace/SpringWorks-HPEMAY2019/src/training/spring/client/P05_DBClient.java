package training.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.db.Student;
import training.spring.db.StudentJDBCTemplate;

public class P05_DBClient {
	public static void main(String[] args) {
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("ApplicationContextDB.xml");
		
		StudentJDBCTemplate template = 
				(StudentJDBCTemplate) 
				context.getBean("studentJDBCTemplate");
		
//		insert(template);
		
		// select 
//		Student student = template.getStudent(101); 
//		System.out.println(student);
		
		// selectd all records 
		
//		for(Student temp : template.listStudents()) {
//			System.out.println(temp);
//		}
		
//		template.deleteStudent(101);
		template.updateStudent(102, 70);
	}

	private static void insert(StudentJDBCTemplate template) {
		Student student = new Student();
		student.setStudentId(103);
		student.setStudentName("Kanchan");
		student.setStudentAge(18);
		student.setMarks(75);
		
		template.inserteStudent(student);
		
		System.out.println("Inserted... ");
	}
}
