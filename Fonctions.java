public class Fonctions
{
	public static void main (String[] args)
	{
		int resultat,premierNombre,secondNombre;
		premierNombre = Integer.parseInt(args[0]);
		secondNombre = Integer.parseInt(args[1]);
		resultat = Multiplication(premierNombre,secondNombre);
		System.out.println(resultat);
	}
	public static int Multiplication(int var1, int var2)
	{
		return(var1 * var2);
	}
}