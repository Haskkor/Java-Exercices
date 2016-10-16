public class For
{
	public static void main (String[] args)
	{
		int i = 0, j = 0;
		for (i=0;i<10;i++)
		{
			System.out.println("Ici la boucle for.     " + i);
			if (i == 6)
			{
				System.out.println("C'est la 7ème itération.");
			}
			for (j=0;j<10;j++)
			{
				System.out.println("Ici la boucle for.    " + j);
				if (j == 6)
				{
					System.out.println("C'est la 7eme iteration.");
				}
			}
			j = 0;
		}
	}
}