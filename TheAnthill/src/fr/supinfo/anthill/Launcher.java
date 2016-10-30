package fr.supinfo.anthill;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nbR;
		int nbT;
		int nbM;
		int nbL;
		int nbGenerations;
		
		System.out.print("Combien voulez-vous de reines : ");
		nbR = sc.nextInt();
		System.out.print("Combien voulez-vous de travailleurs : ");
		nbT = sc.nextInt();
		System.out.print("Combien voulez-vous de males : ");
		nbM = sc.nextInt();
		System.out.print("Combien voulez-vous de larves : ");
		nbL = sc.nextInt();
		
		boolean bool = true;
		AntHill anthill = new AntHill(nbR,nbM,nbT,nbL);
		
		while (bool) {
			System.out.println("\n");
			System.out.println("La fourmilière a : "+ anthill.ageAntHill + " ans.");
			System.out.println("Il y a : "+ anthill.queensList.size() + " reines.");
			System.out.println("Il y a : "+ anthill.larvaeList.size() + " larves.");
			System.out.println("Il y a : "+ anthill.workersList.size() + " travailleurs.");
			System.out.println("Il y a : "+ anthill.malesList.size() + " males.");
			System.out.println("Il y a eu : "+ anthill.nbDeaths + " morts.");
			System.out.println("Il y a eu : "+ anthill.nbBirth + " naissances.");
			System.out.println("\n");
			System.out.print("Entrez un nombre de générations à sauter : ");
			nbGenerations = sc.nextInt();	
			for (int i = 0; i < nbGenerations; i++) {
				anthill.evolving();
			}
			System.out.println("\n");
		}
		
		sc.close();
	}

}
