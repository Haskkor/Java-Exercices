public class ExceptionDivision
{
	public static void main (String[] args)
	{
		int resultat = 0,premierNombre,secondNombre;
		premierNombre = Integer.parseInt(args[0]);
		secondNombre = Integer.parseInt(args[1]);
		try
		{
			resultat = Division(premierNombre,secondNombre);
			System.out.println(resultat);
		}
		catch(Exception e)
		{
			System.out.println("Impossible de diviser par 0.");
		}		
	}
	public static int Division(int var1, int var2)
	{
		return(var1 / var2);
	}
}