package training.hpe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="HUMAN")
public class Human {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="HUMAN_ID")
	private int hid; 

	@Column(name="human_name", nullable=false)
	private String name; 
	private String work; 
	private double income; 
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PERSON_LANGUAGE", 
		joinColumns = {@JoinColumn(name="HUMAN_ID")}, 
		inverseJoinColumns= {@JoinColumn(name="LANGUAGE_ID")}
	)
	private List<Language> languages = 
		new ArrayList<>(); 
	
	
}








