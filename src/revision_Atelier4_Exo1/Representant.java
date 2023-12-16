package revision_Atelier4_Exo1;

public class Representant extends Employe {
	
	private double chiffre_Affaire;
	
	public Representant(String nom,String prenom,int age,int start_Service,double chiffre_Affaire)
	{
		super(nom,prenom,age,start_Service);
		this.chiffre_Affaire=chiffre_Affaire;
		
	}

	@Override
	public double calculerSalaire() {
		return 0.2*chiffre_Affaire+800;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", chiffreAffaire=" + chiffre_Affaire ;
	}

}
