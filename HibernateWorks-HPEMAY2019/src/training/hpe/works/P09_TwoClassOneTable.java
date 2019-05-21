package training.hpe.works;

import org.hibernate.Session;

import training.hpe.entity.College;
import training.hpe.entity.CollegeDetails;
import training.hpe.util.HibernateUtil;

public class P09_TwoClassOneTable {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		
		session.beginTransaction();
		
		CollegeDetails collegeDetails = new CollegeDetails
			(567, "Mysuru", "+91 9900524255");
		
		College college = new College(0, "MAHARAJA COLLEGE", collegeDetails); 
		
		session.save(college); 
		
		session.getTransaction().commit(); 
		
		System.out.println("Saved to DB... ");
		
		
		
	}
}
