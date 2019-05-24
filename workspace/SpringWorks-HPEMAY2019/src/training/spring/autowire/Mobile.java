package training.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mymobile")
public class Mobile {
	@Autowired
	private Speaker speaker; 
	@Autowired
	private Camera camera;
	@Autowired
	private Screen screen;
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Mobile [speaker=" + speaker + ", camera=" + camera + ", screen=" + screen + "]";
	} 
	
	
	
}
