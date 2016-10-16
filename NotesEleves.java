import java.io.Console;

public class NotesEleves
{
	public static void main (String[] args)
	{
		Console cnsle;
		int choix = 0, cpteur = 0, i = 0, cpteurNot = 0;
		cnsle = System.console();
		boolean continuer = true;
		float noteLow = 20, noteHigh = 0;
		float[][] tabNotes = new float[50][15];
		String[] tabNoms = new String[50];
	
		while (continuer)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("1 - Nouvelle saisie.");
			System.out.println("2 - Afficher les notes.");
			System.out.println("3 - Moyenne, note la plus haute, note la plus basse.");
			System.out.println("4 - Rechercher un eleve.");
			System.out.println("9 - Sortir.");
			System.out.println("");
			System.out.println("");
			
			choix = Integer.parseInt(cnsle.readLine("Entrez votre choix : "));
			switch(choix)
			{
				case 1 : 
					System.out.println("");
					System.out.println("");
					tabNoms[cpteur] = cnsle.readLine("Entrez un nom : ");
					for (cpteurNot = 0; cpteurNot < 10; cpteurNot++)
					{
						tabNotes[cpteur][cpteurNot] = Float.parseFloat(cnsle.readLine("Entrez une note : "));
					}
					System.out.println("");
					System.out.println("");
					cpteur++;
					break;
				case 2 :
					System.out.println("");
					System.out.println("");
					for (i=0;i<cpteur;i++)
					{
						System.out.print(tabNoms[i] + "        ");
						for (cpteurNot = 0; cpteurNot < 10; cpteurNot++)
						{
							System.out.print(tabNotes[i][cpteurNot] + "  ");
						}
						System.out.println("");
					}
					System.out.println("");
					System.out.println("");
					break;
				case 3 :
					System.out.println("");
					System.out.println("");
					if (cpteur == 0)
					{
						System.out.println("Vous devez rentrer des données avant de vouloir les exploiter...");
					}
					else
					{
						for (i=0;i<cpteur;i++)
						{
							tabNotes[i][11] = 0;
							for (cpteurNot = 0; cpteurNot < 10; cpteurNot++)
							{
								tabNotes[i][11] += tabNotes[i][cpteurNot];
							}
							tabNotes[i][11] /= 10;
							if (tabNotes[i][11] < noteLow)
							{
								noteLow = tabNotes[i][11];
							}
							if (tabNotes[i][11] > noteHigh)
							{
								noteHigh = tabNotes[i][11];
							}
							System.out.print(tabNoms[i] + "        " + tabNotes[i][11]);
							System.out.println("");
						}
						System.out.print("La moyenne la plus basse est : " + noteLow);
						System.out.println("");
						System.out.print("La moyenne la plus haute est : " + noteHigh);
						System.out.println("");
					}
					break;
				case 4 : 
					break;
				case 9 : 
					continuer = false;
					break;
				default :
					break;
			}
		}
	}
}	