package training.hpe.entity;

import javax.persistence.Embeddable;

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

@Embeddable
public class CollegeDetails {
	private int collegeStrength; 
	private String collegeLocation; 
	private String collegeContact; 
}
