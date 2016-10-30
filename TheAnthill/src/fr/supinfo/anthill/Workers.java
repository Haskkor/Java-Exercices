package fr.supinfo.anthill;

public class Workers extends Ant{

	public Workers() {
		Ant.genIdentifier++;
		this.identifier = Ant.genIdentifier;
		this.maxAge = 50;
		this.age = 10;
	}
	
}
