package training.hpe.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Employee",
	uniqueConstraints= {
			@UniqueConstraint(columnNames="id"), 
			@UniqueConstraint(columnNames="EMPLOYEE_EMAIL")
		})
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private int employeeId;
	
	@Column(name="EMPLOYEE_EMAIL", unique=true, 
				nullable=false, length=100)
	private String email; 

	@Column(name="FIRST_NAME", nullable=false, length=40 )
	private String firstName; 
	
	@Column(name="LAST_NAME", nullable=false, length=50)
	private String lastName; 
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="EMPLOYEE_ID")
	private Set<AccountEntity> accounts; 
}






