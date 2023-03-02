package Lecture7;

public class ToasterTest {

	public static void main(String[] args) {

		Bread b = new Bread();
		Toaster t = new Toaster();
		
		for (int i=0; i<15; i++) {
			t.toast(b);
			System.out.println("bread: " + b.getState());
		}

	}

}
