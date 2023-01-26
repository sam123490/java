
public class Driver extends Car {
	private String name;
	
	public Driver(String name) {
		super();
		this.name = name;
	}
	
//	getter and setter for name attribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void drive() {
		if(gas >= 1) {
			gas -= 1;
			System.out.println("You drive the car.\nGas remaining: " + getGas());
		}
		gameOver();
	}
	public void useBooster() {
		if(gas >= 3) {
			gas -= 3;		
			System.out.println("You use booster.\nGas remaining: " + getGas());
		}
		else {
			System.out.println("3 gas required to user booster!\nGas remaining: " + getGas());
		}
		gameOver();
	}
	public void refuel() {
		if(gas <= 8) {
			gas += 2;			
			System.out.println("You refuel.\nGas remaining: " + getGas());
		}
		else {
			System.out.println("Too much gas to refuel.\nGas remaining: " + getGas());
		}
		gameOver();
	}
}
