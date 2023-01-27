package java.oop.zookeeper;

public class Mammal {
	protected int energy;
	public static int numOfMammals = 0;
	
	public Mammal() {
		this.energy = 100;
		numOfMammals++;
	}
	
	public Mammal(int energy) {
		this.energy = energy;
		numOfMammals++;
	}
	
	public int displayEnergy() {
		System.out.println("Energy: " + energy);
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public static int mammalCount() {
		System.out.println("There are " + numOfMammals + " Mammals");
		return numOfMammals;
	}
}
