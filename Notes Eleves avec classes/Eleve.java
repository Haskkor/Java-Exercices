public class Eleve
{
	private String nom;
	private String prenom;
	public float[] tabNotes = new float[10];
	private float moyenne = 0;
	
	public Eleve(String nomEleve, String prenomEleve)
	{
		nom = nomEleve;
		prenom = prenomEleve;
	}
	
	public void CalculMoyenneEleve()
	{
		int i = 0;
		int somme = 0;
		
		for(i = 0; i < 10; i++)
		{
			somme += tabNotes[i];
		}
		
		moyenne = somme / 10;
	}
		
	
	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public float getMoyenne()
	{
		return moyenne;
	}
	
	public void setNotes(int index, float note)
	{
		tabNotes[index] = note;
	}
}