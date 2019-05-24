package training.spring.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
	@Value(value="mono")
	private String type; 
	@Value(value="30")
	private int volLevels;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolLevels() {
		return volLevels;
	}
	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volLevels=" + volLevels + "]";
	} 
	
	
}
