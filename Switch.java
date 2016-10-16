public class Switch
{
	public static void main (String[] args)
	{
		int variable;
		variable = 5;
		switch (variable)
		{
			case 1 :
				System.out.println("Egale à 1.");
				break;
			case 2 : 
				System.out.println("Egale à 2.");
				break;
			case 3 : 
				System.out.println("Egale à 3.");
				break;
			case 4 : 
				System.out.println("Egale à 4.");
				break;
			default :
				System.out.println("En dehors des bornes.");
				break;
		}
	}
}