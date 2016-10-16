import java.util.*;


public class Conversion 
{

	public static void main(String[] args) 
	{
		double bMin, bMax, pas;
		char choix;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("      CONVERSION DEGRES CELSIUS ET DEGRES FARENHEIT");
		System.out.println("---------------------------------------------------------\n");

		do
		{
			do
			{
			System.out.print("Donnez la borne minimum : ");
			bMin = sc.nextDouble();
			System.out.print("Donnez la borne maximum : ");
			bMax = sc.nextDouble();
			System.out.print("Donnez le pas : ");
			pas = sc.nextDouble();
			}while((bMin > bMax) && pas > (bMax - bMin)) ;
			
			System.out.println("TABLE DE CONVERSION CELSIUS / FARHRENHEIT");
			System.out.println("-----------------------------------------");
			System.out.println("     Celsius       |       Fahrenheit    ");
			System.out.println("-----------------------------------------");
			for (double i = bMin;i<=bMax;i=i+pas)
			{
				if (i < 10)
				{
					System.out.println("       " + i + "         |           " + arrondi(i*9/5+32,1));
				}
				else if ((i >= 10) && (i < 100))
				{
					System.out.println("      " + i + "         |           " + arrondi(i*9/5+32,1));
				}
				else
				{
					System.out.println("     " + i + "         |           " + arrondi(i*9/5+32,1));
				}
			}
			do
			{
				System.out.print("Souhaitez-vous éditer une autre table? (O/N) : ");
				choix = sc.next().charAt(0);
			}while(choix != 'O' && choix != 'o' && choix != 'N' && choix != 'n');
		}while(choix == 'O' || choix == 'o');
		System.out.print("Au revoir.");
	}
	
	public static double arrondi(double A, int B) 
	{
	     return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}
