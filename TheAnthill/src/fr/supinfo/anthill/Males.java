package fr.supinfo.anthill;

public class Males extends Ant{

	public Males() {
		Ant.genIdentifier++;
		this.identifier = Ant.genIdentifier;
		this.maxAge = 20;
		this.age = 10;
	}
	
}
