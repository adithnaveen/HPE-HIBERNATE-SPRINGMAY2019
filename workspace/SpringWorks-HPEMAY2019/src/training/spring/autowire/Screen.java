package training.spring.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Screen {
	@Value(value="tuffun")
	private String glassType;
	@Value(value="10")
	private int len; 
	@Value(value="5")
	private int bre;
	
	
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	@Override
	public String toString() {
		return "Screen [glassType=" + glassType + ", len=" + len + ", bre=" + bre + "]";
	} 
	
	
}
