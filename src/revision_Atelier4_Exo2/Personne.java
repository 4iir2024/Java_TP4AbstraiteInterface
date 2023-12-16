package revision_Atelier4_Exo2;

public abstract class Personne {
	
	private String nom,prenom,date ;

	public Personne(String nom, String prenom, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}
	
	public abstract void description();

	@Override
	public String toString() {
		return " nom=" + nom + ", prenom=" + prenom + ", date=" + date ;
	}
	
	
	
	

}
