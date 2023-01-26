
public class Car {
	protected int gas;
	
	public Car() {
		this.gas = 10;
	}
	
	public int getGas() {
//		System.out.println("Gas remaining: " + gas);
		return gas;
	}
	
	public void gameOver() {
		if(gas == 0) {
			System.out.println("GAME OVER!");			
		}
	}
}
