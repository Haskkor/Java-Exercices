public class Switch
{
	public static void main (String[] args)
	{
		int variable;
		variable = 5;
		switch (variable)
		{
			case 1 :
				System.out.println("Egale � 1.");
				break;
			case 2 : 
				System.out.println("Egale � 2.");
				break;
			case 3 : 
				System.out.println("Egale � 3.");
				break;
			case 4 : 
				System.out.println("Egale � 4.");
				break;
			default :
				System.out.println("En dehors des bornes.");
				break;
		}
	}
}