

public class Voiture{

		//les constucteurs

		public Voiture( )
		{
	
		}
		
		
		public Voiture( String id_const,String marque_const)
		{
			id=id_const;
			marque=marque_const;
		}
		
		
		
		public Voiture( String id_const,String marque_const,String couleur_const,int nbp_const)
		{
			id = id_const;
			marque = marque_const;
			couleur = couleur_const;
			nbp = nbp_const;
		}
	
		
		//les membres de la classe
		String id;
		String marque;
		String couleur;
		int nbp;
		
		//les methodes de la classe
		void Freiner()
		{
			System.out.println(" La voiture a freine");
		}
		
		void Tutut()
		{
		System.out.println(" La voiture a fait tutut");
		}
	
	
	
	
}