
public class Mammal {

	private int energyLevel = 100;
	
	public Mammal() {}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
		this.energyLevel++;
	}
	
	public int energyCount() {
		return this.energyLevel;
	}
	
	public void displayEnergy() {
		this.energyLevel = energyLevel;
	}


	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		
	}
	
	
	
	
}
