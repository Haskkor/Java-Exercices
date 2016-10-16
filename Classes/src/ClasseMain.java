import java.util.*;

public class ClasseMain 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ville, pays;
		int habitants;
		
		/*System.out.print("Entrez le nom d'une ville : ");
		ville = sc.next().toString();
		System.out.print("Entrez son pays d'origine : ");
		pays = sc.next().toString();
		System.out.print("Entrez le nombre d'habitants : ");
		habitants = sc.nextInt();
		Ville ville1 = new Ville(ville,habitants,pays);
		Capitale cap1 = new Capitale();
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstances());
		System.out.println(cap1.toString());
		Capitale cap2 = new Capitale("Paris", 654987, "France", "Sarkozy");
		System.out.println("\n"+cap2.toString());
		
		
		Ville tableau[] = new Ville[6];
		String tab[] = {"Marseille","Lille","Caen","Lyon","Paris","Nantes"};
		int tab2[] = {123456,78456,654987,75832165,1594,213};
		for(int i = 0;i < 6;i++)
		{
			if (i < 3)
			{
				Ville v = new Ville(tab[i],tab2[i],"France");
				tableau[i] = v;
			}
			else
			{
				Capitale c = new Capitale(tab[i],tab2[i],"France","Sarko");
				tableau[i] = c;
			}
		}
		for(Object obj : tableau)
		{
			System.out.println(obj.toString()+"\n");
		}*/
		
		
		// Avec exceptions.
		Ville v = null;
		try
		{
			v = new Ville("Rennes", -12000, "France");
		}
		catch (NombreHabitantsException e)
		{
			v = new Ville();
		}
		System.out.println(v.toString());
		
		
	}

}
