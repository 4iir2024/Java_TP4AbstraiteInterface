package revision_Atelier4_Exo1;

public class Manutentionnaire extends Employe {
	
	private int nb_HeuresTravail;
	
	public Manutentionnaire(String nom,String prenom,int age,int start_Service,int nb_HeuresTravail)
	{
		super(nom,prenom,age,start_Service);
		this.nb_HeuresTravail=nb_HeuresTravail;
		
	}

	@Override
	public double calculerSalaire() {
		
		return nb_HeuresTravail*65;
	}

	@Override
	public String toString() {
		return super.toString()+"nb_HeuresTravail=" + nb_HeuresTravail ;
	}
	
	

}
