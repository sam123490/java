package mammal;

public class MammalTest {

	public static void main(String[] args) {
		// Gorilla Test
		Gorilla harambe = new Gorilla();
		harambe.throwObject();
		harambe.throwObject();
		harambe.throwObject();
		harambe.eatBananas();
		harambe.eatBananas();
		harambe.climb();
		harambe.displayEnergy();
		
		// Bat Test
		Bat dracula = new Bat();
		dracula.attackTown();
		dracula.eatHuman();
		dracula.eatHuman();
		dracula.fly();
		dracula.attackTown();
		dracula.fly();
		dracula.attackTown();
		dracula.displayEnergy();
		
	}

}
