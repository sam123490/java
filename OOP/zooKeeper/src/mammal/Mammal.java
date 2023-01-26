package mammal;

public class Mammal {
	protected int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergy() {
		System.out.println("Energy: " + energy);
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
