
public class Driver extends Car {
	
	public Driver() {
		super();
	}
	
	public void drive() {
		if(checkDriveGas()) {
			gas -= 1;
			System.out.println("You drive the car.\nGas remaining: " + gas);
		}
	}
	public void useBooster() {
		if(checkBoosterGas()) {
			gas -= 3;		
			System.out.println("You use booster.\nGas remaining: " + gas);
		}
	}
	public void refuel() {
		if(checkRefuel()) {
			gas += 2;			
			System.out.println("You refuel.\nGas remaining: " + gas);
		}
	}
}
