public class Polymorphism_2 {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        
    }

}

class Dog extends Animal {
    public void walk() {

    }
}

class Cat {
    public void walk() {

    }
}

class Animal {
    public void type(Animal it) {
        System.out.print("walk like an animal");
    }
}