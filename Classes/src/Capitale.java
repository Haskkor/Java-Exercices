
public class Capitale extends Ville 
{
	private String president;
	
	public Capitale()
	{
		super();
		president = "aucun";
	}
	
	public Capitale(String nom, int hab, String pays, String president) throws NombreHabitantsException
	{
		super(nom,hab,pays);
		this.president = president;
	}
	
	public String toString()
	{
		return super.toString() + " / Président : " + this.president;
	}

	public String getPresident() 
	{
		return president;
	}

	public void setPresident(String president) 
	{
		this.president = president;
	}
	
	
}
