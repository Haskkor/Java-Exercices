
public class Ville 
{
	protected String nomVille, nomPays;
	protected int nbrHabitants;
	protected char categorie;
	public static int nbrInstances = 0;
	protected static int nbrInstances2 = 0;
	
	public Ville()
	{
		nbrInstances++;
		nbrInstances2++;
		System.out.println("Création d'une ville.");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbrHabitants = 0;
		this.setCategorie();
	}

	public Ville(String ville, int habitants, String pays) throws NombreHabitantsException
	{
		if (habitants < 0)
		{
			throw new NombreHabitantsException();
		}
		else
		{
			System.out.println("Création de la ville " + ville + ".");
			nomVille = ville;
			nomPays = pays;
			nbrHabitants = habitants;
			this.setCategorie();			
		}
	}
	
	
	
	
	
	public static int getNombreInstances()
	{
		return nbrInstances2;
	}
	
	public String getNomVille()
	{
		return nomVille;
	}
	
	public String getNomPays()
	{
		return nomPays;
	}
	public int getNbrHabitants()
	{
		return nbrHabitants;
	}
	
	public int getCategorie()
	{
		return categorie;
	}
	
	public void setNomVille(String nomV)
	{
		nomVille = nomV;
	}
	
	public void setNomPays(String nomP)
	{
		nomPays = nomP;
	}
	
	public void setNbrHabitants(int nbrH)
	{
		nbrHabitants = nbrH;
	}
	
	
	
	
	
	
	protected void setCategorie()
	{
		int bornes[] = {0,1000,10000,100000,500000,1000000,5000000,10000000};
		char cat[] = {'?','A','B','C','D','E','F','G','H'};
		int i = 0;
		
		while (i < bornes.length && this.nbrHabitants >= bornes[i])
		{
			i++;
		}
		
		this.categorie = cat[i];
	}
	
	public String toString()
	{
		return "Ville : " + this.nomVille + " / Pays : " + this.nomPays + " / Nombre d'habitants : " + this.nbrHabitants + " / Catégorie : " + this.categorie;
	}
	
	public String comparerVille(Ville v)
	{
		String str = new String();
		
		if (v.getNbrHabitants() > this.nbrHabitants)
		{
			str = v.getNomVille() + " est une ville plus peuplée que " + this.nomVille;
		}
		else 
		{
			str = this.nomVille + " est une ville plus peuplée que " + v.getNomVille();
		}
		
		return str;
	}
	
	
	
}
