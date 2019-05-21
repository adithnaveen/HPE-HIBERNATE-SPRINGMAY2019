package training.hpe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class AccountEntity {

	// auto generated value
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int accountId; 
	
	// actual account number 
	@Column(name="ACC_NUMBER", length=10)
	private String accountNumber;
	
	@ManyToOne
	private EmployeeEntity employee; 
	
	
}
