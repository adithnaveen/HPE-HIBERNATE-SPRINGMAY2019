package training.spring.postprocessor;

public class Employee {
	private int empId; 
	private String empEmail; 
	private double salary; 
	private Name name;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empEmail=" + empEmail + ", salary=" + salary + ", name=" + name + "]";
	} 
	
	
	
}
