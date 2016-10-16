import java.io.Console;

public class TestEleve
{
	static Eleve[] eleves = new Eleve[25];
	static int nbrEleves = 0;
		
	public static void main (String[] args)
	{
		Console cnsle;
		cnsle = System.console();
		int choix = 0;
		boolean continuer = true;
		
		System.out.println("");
		System.out.println("");
		System.out.println("1 - Nouvelle saisie.");
		System.out.println("2 - Afficher les notes.");
		System.out.println("9 - Sortir.");
		System.out.println("");
		System.out.println("");
		
		while(continuer)
		{
			choix = Integer.parseInt(cnsle.readLine("Entrez votre choix : "));
			switch(choix)
			{
				case 1 : 
					nouveau();
					break;
				case 2 : 
					afficherTout();
					break;
				case 9 :
					continuer = false;
					break;
				default : 
					break;
			}
		}
	}
	
	public static void nouveau()
	{
		Console cnsle;
		cnsle = System.console();
		String paramNom, paramPrenom;
		eleves[nbrEleves] = new Eleve(cnsle.readLine("Entrez votre nom : "),cnsle.readLine("Entrez votre prénom : "));
	}
	
	public static void afficherTout()
	{
	
	}
}