package fr.supinfo.anthill;

import java.util.ArrayList;

public class AntHill {

	int ageAntHill;	
	int nbDeaths;
	int nbBirth;
	ArrayList<Ant> queensList = new ArrayList<Ant>();
	ArrayList<Ant> workersList = new ArrayList<Ant>();
	ArrayList<Ant> malesList = new ArrayList<Ant>();
	ArrayList<Ant> larvaeList = new ArrayList<Ant>();
	
	public AntHill(int nbQ, int nbM, int nbW, int nbL) {
		for (int i = 0; i < nbQ; i++) {
			this.queensList.add(new Queens());
		}
		for (int i = 0; i < nbM; i++) {
			this.malesList.add(new Males());
		}
		for (int i = 0; i < nbW; i++) {
			this.workersList.add(new Workers());
		}
		for (int i = 0; i < nbL; i++) {
			this.larvaeList.add(new Larva());
		}
		this.ageAntHill = 0;
	}
	
	public void evolving() {

		this.nbDeaths = 0;
		this.nbBirth = 0;
		this.ageAntHill++;
		for (int i = 0; i < this.larvaeList.size(); i++) {
			this.larvaeList.get(i).age++;
			if (this.larvaeList.get(i).age == this.larvaeList.get(i).maxAge) {
				if (this.larvaeList.get(i).future instanceof Queens){
					this.queensList.add(new Queens());
				}
				else if (this.larvaeList.get(i).future instanceof Males){
					this.malesList.add(new Males());
				}
				else this.workersList.add(new Workers());
				this.larvaeList.remove(i);
				i--;
			}
		}
		for (int i = 0; i < this.malesList.size(); i++) {
			this.malesList.get(i).age++;
			if (this.malesList.get(i).age == this.malesList.get(i).maxAge) {
				this.malesList.remove(i);
				i--;
				this.nbDeaths++;
			}
		}
		for (int i = 0; i < this.queensList.size(); i++) {
			this.queensList.get(i).age++;
			if (this.queensList.get(i).age == this.queensList.get(i).maxAge) {
				this.queensList.remove(i);
				i--;
				this.nbDeaths++;
			}
			if (!this.malesList.isEmpty()) {
				for (int j = 0; j < 10; j++) {
					this.larvaeList.add(new Larva());
					this.nbBirth++;
				}
			}
		}
		for (int i = 0; i < this.workersList.size(); i++) {
			this.workersList.get(i).age++;
			if (this.workersList.get(i).age == this.workersList.get(i).maxAge) {
				this.workersList.remove(i);
				i--;
				this.nbDeaths++;
			}
		}
	}
}
