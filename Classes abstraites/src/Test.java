
public class Test 
{

	public static void main(String[] args) 
	{
		/*Loup loup = new Loup("Gris",20);
		loup.boire();
		loup.manger();
		loup.deplacement();
		loup.crier();
		System.out.println(loup.toString());
		
		Object tigre = new Tigre("Blanc et noir", 200);
		((Animal)tigre).boire();
		((Animal)tigre).manger();
		((Animal)tigre).deplacement();
		((Animal)tigre).crier();
		System.out.println(tigre.toString());*/
		
		Chien chien = new Chien("Noir",8);
		chien.boire();
		chien.manger();
		chien.deplacement();
		chien.crier();
		System.out.println(chien.toString());
		chien.faireCalin();
		chien.faireLeBeau();
		chien.faireLechouille();
		System.out.println("-------------------------");
		Rintintin rint = new Chien();
		rint.faireCalin();
		rint.faireLeBeau();
		rint.faireLechouille();
		
	}

}
