
public class GorillaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gorilla gorilla = new Gorilla();  
		
		System.out.println(gorilla.throwSomething());
		System.out.println(gorilla.throwSomething());
		System.out.println(gorilla.throwSomething());
		System.out.println(gorilla.getEnergyLevel());
		
		System.out.println(gorilla.eatBananas());
		System.out.println(gorilla.eatBananas());
		System.out.println(gorilla.getEnergyLevel());
		
		System.out.println(gorilla.climb());
		System.out.println(gorilla.getEnergyLevel());
		
		Bat bat = new Bat();
		
		System.out.println(bat.getEnergyLevel());
		System.out.println(bat.attackTown());
		System.out.println(bat.getEnergyLevel());
		System.out.println(bat.attackTown());
		System.out.println(bat.getEnergyLevel());
		System.out.println(bat.attackTown());
		System.out.println(bat.getEnergyLevel());
		
		bat.eatHumans();
		bat.eatHumans();
		System.out.println(bat.getEnergyLevel());
		System.out.println(bat.fly());
		System.out.println(bat.fly());
		System.out.println(bat.getEnergyLevel());
		
		
		
	}

}
