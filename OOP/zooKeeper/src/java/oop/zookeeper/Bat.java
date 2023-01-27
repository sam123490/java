package java.oop.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("WOOoooshhhhh!");
		energy -= 50;
	}
	
	public void eatHuman() {
		System.out.println("Oh my...");
		energy += 25;
	}
	
	public void attackTown() {
		System.out.println("AHHHhhhhh!!! HELPPPP!!!");
		energy -= 100;
	}	
}
