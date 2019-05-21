package training.hpe.works;

import org.hibernate.Session;

import training.hpe.entity.CellPhone;
import training.hpe.entity.Product;
import training.hpe.entity.Television;
import training.hpe.util.HibernateUtil;

public class P08_InheritanceExample {
	public static void main(String[] args) {
		
		Product products[] = {
				new Television(111, "Samsung", "Flat Screen", 
						700, 52, "LCD", "1024x786"),
				new Television(112, "LG", "Bulge Screen", 
						750, 52, "LED", "2024x1286"),
				new CellPhone(201, "Apple", 
					"Smart Phone with Full display", 1200, 
					"Smart", "ios", "GSM"), 
				new CellPhone(202, "OnePlus", 
						"SmartPhone Full Touch Screen", 750, 
						"Smart", "Android", "CDMA"), 
		};
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 

		for(Product temp : products) {
			session.persist(temp);
		}
		
		session.beginTransaction().commit(); 
		
		System.out.println("Data Saved... ");
		
		
		
		
	}
}







