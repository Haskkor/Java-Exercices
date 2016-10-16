import java.util.*;

public class NbrsPremiers
{
	public static void main (String[] args)
	{
		int borneMin = 0, borneMax = 0, nbrTest = 0, diviseur = 2, compteur = 0;
		boolean premier = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la borne minimum : ");
		borneMin = sc.nextInt();
		System.out.print("Entrez la borne maximum : ");
		borneMax = sc.nextInt();
		
		for(nbrTest = borneMin;nbrTest <= borneMax;nbrTest++)
		{
			premier = true;
			for (diviseur = 2;diviseur < nbrTest;diviseur++)
			{
				if (nbrTest % diviseur == 0)
				{
					diviseur = nbrTest;
					premier = false;
				}
			}
			if (premier == true)
			{
				System.out.println("Le nombre " + nbrTest + " est premier.");
				compteur++;
			}
			else
			{
				System.out.println("*************************");
			}
		}
		System.out.println("Vous avez trouve " + compteur + " nombres premiers.");
	}
}