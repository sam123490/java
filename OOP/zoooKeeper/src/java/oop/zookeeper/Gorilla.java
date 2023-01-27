package java.oop.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwObject() {
		energy -= 5;
		System.out.println("Gorilla throws!");
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("Yummyy Banana good!");
	}
	
	public void climb() {
		energy -= 10;
		System.out.println("Gorilla climbs!");
	}
}
