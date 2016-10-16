public class Tableaux
{
	public static void main (String[] args)
	{
		int choixMois;
		String[] mois = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		choixMois = Integer.parseInt(args[0]);
		System.out.println(mois[choixMois - 1]);
	}
}	



