package fr.supinfo.anthill;

public class Larva extends Ant {

	int lower = 0; 
	int higher = 20; 
	
	public Larva() {
		Ant.genIdentifier++;
		this.identifier = Ant.genIdentifier;
		this.maxAge = 10;
		this.age = 0;
		int random = (int)(Math.random() * (higher+1-lower)) + lower;
		
		if (random == 2 || random == 3) {
			this.future = new Males();
		}
		else if (random == 1) {
			this.future =  new Queens();
		}
		else this.future = new Workers();
	}
}
