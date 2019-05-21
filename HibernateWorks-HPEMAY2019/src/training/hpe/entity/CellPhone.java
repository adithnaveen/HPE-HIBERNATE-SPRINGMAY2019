package training.hpe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class CellPhone extends Product{
	private String type; // smart phone or featured phone 
	private String os; // iOS, Android, Windows 
	private String connectivity; // GSM, CDMA 
	
	public CellPhone(int pId, String pName, String pDesc, double pPrice, 
			String type, String os, String connectivity) {
		super(pId, pName, pDesc, pPrice); 
		this.type = type; 
		this.os = os; 
		this.connectivity = connectivity; 
	}
	
}
