
public class Car {
	protected int gas;
	
	public Car() {
		this.gas = 10;
	}
	
	public int getGas() {
		System.out.println("Gas remaining: " + gas);
		return gas;
	}
	
	public boolean checkDriveGas() {
		if(gas >= 1) {
			return true;
		}
		else {
			System.out.println("You have run out of Gas\nGAME OVER!");
			return false;
		}
	}
	public boolean checkBoosterGas() {
		if(gas >= 3) {
			return true;
		}
		else {
			System.out.println("You need 3 gas to use booster.\n" + getGas());
			return false;
		}
	}
	public boolean checkRefuel() {
		if(gas <= 8) {
			return true;
		}
		else {
			System.out.println("You have too much gas to refuel.\n" + getGas());
			return false;
		}
	}
}
