public class If
{
	public static void main (String[] args)
	{
		int variable;
		variable = 10;
		if (variable < 0)
		{
			System.out.println("Inf�rieur � 0.");
		}
		if (variable > 15)
		{
			System.out.println("Sup�rieur � 15.");
		}
		if (variable > 0 && variable < 15)
		{
			System.out.println("Compris entre 0 et 15.");
		}
		variable = 15;
	}
}