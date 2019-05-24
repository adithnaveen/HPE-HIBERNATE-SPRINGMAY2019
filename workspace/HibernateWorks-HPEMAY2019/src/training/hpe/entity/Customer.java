package training.hpe.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CustomerMaster")
@SecondaryTable(name="CustomerDetail")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue
	private int customerId; 
	
	private String customerName; 
	
	@Column(table="CustomerDetail")
	private double customerIncome; 
	
	@Column(table="CustomerDetail")
	private String customerEmail;
	
	@Temporal(TemporalType.DATE)
	private Calendar calendar; 
	@Transient
	private String secretPassword; 
	
}
