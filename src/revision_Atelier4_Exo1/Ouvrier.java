package revision_Atelier4_Exo1;

public class Ouvrier extends Employe {
	

	private double nb_Unite_Prod;
	
	public Ouvrier(String nom,String prenom,int age,int start_Service,double nb_Unite_Prod)
	{
		super(nom,prenom,age,start_Service);
		this.nb_Unite_Prod=nb_Unite_Prod;
	}

	@Override
	public double calculerSalaire() {
		
		return nb_Unite_Prod*5;
	}

	@Override
	public String toString() {
		return super.toString() +"nb_Unite_Prod=" + nb_Unite_Prod ;
	}

}
