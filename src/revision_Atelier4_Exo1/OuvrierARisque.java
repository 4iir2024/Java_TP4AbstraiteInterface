package revision_Atelier4_Exo1;

public class OuvrierARisque extends Ouvrier implements EmployeARisque {

	public OuvrierARisque(String nom, String prenom, int age, int start_Service, double nb_Unite_Prod) {
		super(nom, prenom, age, start_Service, nb_Unite_Prod);
		
	}
	
	public double calculerSalaire()
	{
		return super.calculerSalaire()+EmployeARisque.PRIME;
	}
	
	
	

}
