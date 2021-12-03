
public class Gorilla extends Mammal {

	
	public Gorilla() {
//		super();
	}
	
	public String throwSomething() {
		setEnergyLevel (this.getEnergyLevel()-5);
		return "Gorilla Threw Something.";
	}
	
	public String eatBananas() {
		setEnergyLevel(this.getEnergyLevel()+10);
		return "Gorilla ate Bananas.";
	}
	
	public String climb() {
		setEnergyLevel(this.getEnergyLevel()-10);
		return "Gorilla has climbed a tree.";
	}
	

	
}

