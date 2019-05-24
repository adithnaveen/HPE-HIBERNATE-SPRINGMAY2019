package training.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeePostProcess implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof Employee) {
			// all mutation will go here.. 
			Employee emp = (Employee) bean;
			
			Name name = new Name(); 
			name.setFirstName(emp.getName().getFirstName().toUpperCase()); 
			name.setLastName(emp.getName().getLastName().toUpperCase());
			emp.setName(name);
			
			return emp; 
		} else if  (bean instanceof Name){
			return bean; 
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}
}
