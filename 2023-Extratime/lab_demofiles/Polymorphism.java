/**
 * Polymorphism
 */
public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.animalSound();

    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal make sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("This is Pigsound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("This is Dog");
    }
}

/*
 * เราจะใช้ Polymorphism สำหรับการ Reuse attribute และ method อย่างตัวอย่างเราจะทำก
 * ก่าร Reuse code animalsound
 * 
 * เป็นการปลดล็อกการผูกกันของชนิดตัวแปร และ ชนิด class
 * 
 * 
 */