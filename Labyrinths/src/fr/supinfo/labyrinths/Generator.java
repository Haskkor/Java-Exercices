package fr.supinfo.labyrinths;

import java.util.ArrayList;

public class Generator {

	int width;
	int height;
	int nbLabyrinths;
	String fileName;
	Cell[][] laby;
	ArrayList<Coordinates> listCoord = new ArrayList<Coordinates>(); 
	
	public Generator(int width, int height, String fileName) {
		this.width = width + 2;
		this.height = height + 2;
		this.fileName = (fileName + ".laby");
		laby = new Cell[width + 2][height + 2];
	}
	
	public Generator(int nbLabys, int width, int height, String fileName) {
		this.nbLabyrinths = nbLabys;
		this.width = width;
		this.height = height;
		this.fileName = (fileName + ".laby");
		laby = new Cell[width + 2][height + 2];
	}
	
	public void genMaze() {
		
		// Initialisation des bords du tableau en tant que murs.
		for (int i = 0; i < this.width; i++) {
			laby[i][0] = new Cell("X");
		}
		for (int i = 0; i < this.width; i++) {
			laby[i][this.height - 1] = new Cell("X");
		}
		for (int i = 0; i < this.height; i++) {
			laby[0][i] = new Cell("X");
		}
		for (int i = 0; i < this.height; i++) {
			laby[this.width - 1][i] = new Cell("X");
		}
		
		// Initialisation des cases du tableau alternance de X et -.
		
		boolean wall = false;
		for (int i = 1; i < width - 1; i++) {
			for (int j = 1; j < height - 1; j++){
				if (wall) {
					laby[i][j] = new Cell("#");
				} else {
					laby[i][j] = new Cell("-");
					this.listCoord.add(new Coordinates(i,j));
				}
				wall = !wall;
			}
			if (height % 2 == 0) {
				wall = !wall;
			}
		}
		
		// Choix aléatoire d'une cellule du tableau.
		while (!this.listCoord.isEmpty()) {
			int lower = 0;
			int higher = this.listCoord.size() - 1;
			int randomCoord = (int)(Math.random() * (higher+1-lower)) + lower;
			this.listCoord.get(randomCoord);
		}		
	}
}


