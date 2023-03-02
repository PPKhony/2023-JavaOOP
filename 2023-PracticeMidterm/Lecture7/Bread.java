package Lecture7;

public class Bread {
	public static final String SOFT = "Soft";
	public static final String BURNT = "Burnt";
	public static final String CRISP = "Crisp";

	private String state;
	
	public Bread() {
		state = SOFT;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
}
