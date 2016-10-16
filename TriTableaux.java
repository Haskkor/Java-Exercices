public class TriTableaux
{
	public static void main (String[] args)
	{
		int[] tabPairs = new int[9];
		int[] tabImpairs = new int[9]; 
		int i = 0, temp = 0, cptPairs = 0, cptImpairs = 0;
		
		for (i=0;i<10;i++)
		{
			temp = Integer.parseInt(args[i]);
			if(temp % 2 == 0)
			{
				tabPairs[cptPairs] = temp;
				cptPairs++;
			}
			else
			{
				tabImpairs[cptImpairs] = temp;
				cptImpairs++;
			}
		}
		for (i=0;i<cptPairs;i++)
		{
			System.out.println(tabPairs[i]);
		}
		System.out.println("");
		System.out.println("");
		for (i=0;i<cptImpairs;i++)
		{
			System.out.println(tabImpairs[i]);
		}
	}
}	



