public class While
{
	public static void main (String[] args)
	{
		boolean bool;
		int compteur = 0;
		bool = true;
		while (bool)
		{
			System.out.println("Compteur : " + compteur);
			compteur++;
			if (compteur == 1000)
			{
				break;
			}
		}
	}
}