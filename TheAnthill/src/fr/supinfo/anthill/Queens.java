package fr.supinfo.anthill;

public class Queens extends Ant{

	public Queens() {
		Ant.genIdentifier++;
		this.identifier = Ant.genIdentifier;
		this.maxAge = 50;
		this.age = 10;
	}
	
}
