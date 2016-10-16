
public abstract class Animal 
{
	protected String couleur;
	protected int poids;
	
	public void manger()
	{
		System.out.println("Mange de la viande.");
	}
	
	public void boire()
	{
		System.out.println("Bois de l'eau.");
	}
	
	abstract void deplacement();
	
	abstract void crier();
	
	public String toString()
	{
		String str = "Fais partie de la classe : " + this.getClass() + "\nCouleur : " + this.couleur + "\nPoids : " + this.poids;
		return str;
	}
}
