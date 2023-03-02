package Lecture7;

import java.util.Random;

public class Toaster {
	
	private Slot[] slots;
	
	public Toaster() {
		slots = new Slot[2];
		slots[0] = new Slot();
		slots[1] = new Slot();
	}
	
	public void toast(Bread b) {
		Random random = new Random();
		boolean choose = random.nextBoolean();
		if (choose) {
			System.out.print("slot 0: ");
			slots[0].toast(b);
		}
		else {
			System.out.print("slot 1: ");
			slots[1].toast(b);
		}
	}
}
