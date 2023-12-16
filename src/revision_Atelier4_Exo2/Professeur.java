package revision_Atelier4_Exo2;

public class Professeur extends Personne{
	
	private String coursEnseigne;
	
	public Professeur(String nom, String prenom, String date,String coursEnseigne)
	{
		super(nom,prenom,date);
		this.coursEnseigne=coursEnseigne;
		
	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName());
		
	}

}
