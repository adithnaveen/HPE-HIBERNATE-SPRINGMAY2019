package training.hpe.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class College {
	@Id
	@GeneratedValue
	private int collegeId; 
	private String collegeName; 
	
	@Embedded
	private CollegeDetails collegeDetails; 
	
}
