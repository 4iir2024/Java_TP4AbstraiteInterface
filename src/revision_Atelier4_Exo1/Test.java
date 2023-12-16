package revision_Atelier4_Exo1;

public class Test {

	public static void main(String[] args) {
		
		Employe[] employes = new Employe[6];
		
		EmployeARisque[] employesARisque = new EmployeARisque[2];
		
		employes[0] = new Vendeur("Basim", "Janat",34,2003,30000);
		
		employes[1] = new Representant("Karim", "Amir",24,2013,20000);
		
		employes[2] = new Ouvrier("Samir", "Rair",26,2015,12000);
		
		employes[3] = new Manutentionnaire("Adil", "Rami",27,2015,10000);
		
		employes[4] = new OuvrierARisque("Said", "Rair",26,2015,12000);
		
		employes[5] =new ManutentionnaireARisque("Al", "Abordage", 30, 2001, 45);
		
		
		employesARisque[0] = new OuvrierARisque("Said", "Rair",26,2015,12000);
		employesARisque[1] =new ManutentionnaireARisque("Al", "Abordage", 30, 2001, 45);
		
		for (int i=0;i< employes.length;i++)
		{
			System.out.println(employes[i].getNom());
			System.out.println(employes[i]+"\n");
		}
		System.out.println("------------------------------");
		for (int i=0;i< employesARisque.length;i++)
		{
			System.out.println(employesARisque.toString()+"\n");
		}
		
		
		
		
		
		
		

	}

}
