package revision_Atelier4_Exo1;


public abstract class Employe {
	
	private String nom,prenom;
	private int age ;
	private int start_Service;
	
	
	
	public abstract double calculerSalaire();
	
	public String getNom()
	{
		return this.getClass().getSimpleName()+"Le nom : " +nom +"Prenom : "+ this.prenom;
	}
	
	public Employe(String nom,String prenom,int age,int start_Service)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.start_Service=start_Service;
	}
	
	public double calculerSalaireAnnuel() {
		return this.calculerSalaire()*12;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + start_Service
				+ ", calculerSalaire()=" + calculerSalaire() + "]";
	}

	
	
	
	
}
