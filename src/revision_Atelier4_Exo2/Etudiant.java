package revision_Atelier4_Exo2;

public class Etudiant extends Personne{
	
	private String cne;
	double[] notes = new double[6];
	boolean[] inscriptions = new boolean[6];
	
	public Etudiant(String nom, String prenom, String date,String cne)
	{
		super(nom,prenom,date);
		this.cne=cne;
	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName());
		
	}
	
	public double CalculerMoyen()
	{
		double somme=0;
		int cpt=0;
		
		for(int i=0;i<inscriptions.length;i++)
		{
			if(inscriptions[i])
			{
				somme+=notes[i];
				cpt++;
			}
			
			
		}
		
		if(cpt!=0)
			return somme/cpt;
			return 0;
		
	}


	
}
