package fr.supinfo.anthill;

public class Ant {
	
	public static int genIdentifier = 0;
	int age;
	int maxAge;
	int identifier;
	Ant future;
	
	public boolean growOld(Ant ant) {
		ant.age = ant.age ++;
		if (ant.age == ant.maxAge) {
			return true;
		}
		else return false;
	}
}
