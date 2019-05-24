package training.spring.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	// vga / non-vga
	@Value(value="VGA")
	private String type;
	@Value(value="18x55")
	private String lensLength; // 18x55, 55x200 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLensLength() {
		return lensLength;
	}
	public void setLensLength(String lensLength) {
		this.lensLength = lensLength;
	}
	@Override
	public String toString() {
		return "Camera [type=" + type + ", lensLength=" + lensLength + "]";
	}
	
	
	
	
}
