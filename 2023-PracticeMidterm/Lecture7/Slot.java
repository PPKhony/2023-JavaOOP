package Lecture7;

public class Slot {
	private int age;
	
	public Slot() {
		age = 4;
	}
	
	public void toast(Bread b) {
		System.out.print("age: " + age + "\t");
		if (age > 0) {
			b.setState(Bread.CRISP);
		} 
		else {
			b.setState(Bread.BURNT);
		}
		--age;
	}
	public int getAge() {
		return age;
	}
}
