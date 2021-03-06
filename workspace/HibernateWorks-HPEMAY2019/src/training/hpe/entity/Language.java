package training.hpe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="LANGUAGE")

public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LANGUAGE_ID")
	private int lid; 

	private String name; 
	private int fromYear; 
	@Column(name="FROM_GEO_LOCATION")
	private String fromGeoLocation; 
}
