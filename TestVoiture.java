

public class TestVoiture{
public static void main(String[] args) {


	//Voiture voiture1=new Voiture();
	/*Voiture voiture2=new Voiture("james","Peugeot");
	Voiture voiture3=new Voiture("ok","Mercedes","vert");*/
	
    Voiture voiture1=new Voiture();
	
	System.out.println("*******************************");	
	System.out.println("");
	System.out.println(" Numero du parc: "+voiture1.id);
	System.out.println("");
	System.out.println(" marque de ma voiture: "+voiture1.marque);
	System.out.println("");
	System.out.println(" couleur de ma voiture: "+voiture1.couleur);
	System.out.println("");
	System.out.println(" nombre de portes: "+voiture1.nbp);
	System.out.println("");
	//System.out.println(" le vehicle dont le numero de parc est: "+maVoiture.id_Voiture+ " est de marque "+maVoiture.marque_Voiture+" , de couleur "+maVoiture.couleur_Voiture+" elle a "+maVoiture.nbp_Voiture+" portes.");
	System.out.println("");
	voiture1.Freiner();
	
	Voiture voiture2=new Voiture("james","Peugeot");
   
	System.out.println("*******************************");
	System.out.println("");
	System.out.println(" Numero du parc: "+voiture2.id);
	System.out.println("");
	System.out.println(" marque de ma voiture: "+voiture2.marque);
	System.out.println("");
	System.out.println(" couleur de ma voiture: "+voiture2.couleur);
	System.out.println("");
	System.out.println(" nbr de portes: "+voiture2.nbp);
	System.out.println("");
	//System.out.println(" le vehicle dont le numero de parc est: "+voiture1.id_Voiture+ " est de marque "+voiture1.marque_Voiture+" , de couleur "+voiture1.couleur_Voiture+" elle a "+voiture1.nbp_Voiture+" portes.");
	System.out.println("");
	voiture2.Tutut();
	
	Voiture voiture3=new Voiture("ok","Mercedes","vert",4);
	System.out.println("*******************************");
	System.out.println("");
	System.out.println(" Numero du parc: "+voiture3.id);
	System.out.println("");
	System.out.println(" marque de ma voiture: "+voiture3.marque);
	System.out.println("");
	System.out.println(" couleur de ma voiture: "+voiture3.couleur);
	System.out.println("");
	System.out.println(" nbr de portes: "+voiture3.nbp);
	System.out.println("");
	//System.out.println(" le vehicle dont le numero de parc est: "+voiture1.id_Voiture+ " est de marque "+voiture1.marque_Voiture+" , de couleur "+voiture1.couleur_Voiture+" elle a "+voiture1.nbp_Voiture+" portes.");
	System.out.println("");
	voiture3.Tutut();

	}
	
}	