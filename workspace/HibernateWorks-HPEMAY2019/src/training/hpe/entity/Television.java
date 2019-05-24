package training.hpe.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Television extends Product {
	private int size;
	private String screenType; // LCD, LED, CRT
	private String resolution; // 1024 x 776

	public Television(int pId, String pName, String pDesc, double pPrice, int size, String screenType,
			String resolution) {
		super(pId, pName, pDesc, pPrice);
		this.size = size;
		this.screenType = screenType;
		this.resolution = resolution;
	}

}
