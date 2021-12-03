
public class Bat extends Mammal {
	
	public Bat() {
//		super();
		this.setEnergyLevel(300);
	}
	
	public String fly() {
		setEnergyLevel(this.getEnergyLevel()-50);
		return "Flyyyyyy...";
	}
	
	public void eatHumans() {
		setEnergyLevel(this.getEnergyLevel()-25);
	}
	
	public String attackTown() {
		setEnergyLevel(this.getEnergyLevel()-100);
		return "burnnnn...";
	}
	
	
}
