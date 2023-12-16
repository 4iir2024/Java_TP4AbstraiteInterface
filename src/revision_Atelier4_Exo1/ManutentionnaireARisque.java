package revision_Atelier4_Exo1;

public class ManutentionnaireARisque extends Manutentionnaire implements EmployeARisque  {

	public ManutentionnaireARisque(String nom, String prenom, int age, int start_Service, int nb_HeuresTravail) {
		super(nom, prenom, age, start_Service, nb_HeuresTravail);
		
	}
	
	
	public double calculerSalaire()
	{
		return super.calculerSalaire()+EmployeARisque.PRIME;
	}
	

}
