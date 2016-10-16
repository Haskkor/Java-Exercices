
public class Chien extends Canin implements Rintintin
{
	public Chien()
	{
	}
	
	public Chien(String couleur, int poids)
	{
		this.couleur = couleur;
		this.poids = poids;
	}
	
	void crier()
	{
		System.out.println("Aboie.");
	}
	
	public void faireCalin()
	{
		System.out.println("Fais câlin.");
	}
	
	public void faireLechouille()
	{
		System.out.println("Fais léchouille.");
	}
	
	public void faireLeBeau()
	{
		System.out.println("Fais le beau.");
	}
}
