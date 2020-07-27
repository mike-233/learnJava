package sn.talla.banque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("Obama",001,0);
		Compte compte2 = new Compte("Trump",002,0);
		
		compte1.crediter(40000);
		compte2.crediter(20000);
		System.out.println("Voici les informations de la premi�re compte : \n\tPrpri�taire : "+
				compte1.getProperty()+ "\n\tNum�ro compte: "+compte1.getNumber()+"\n\tsolde : "+compte1.getSolde());
		System.out.println("Voici les informations de la deuxi�me compte : \n\tPropri�taire : "+
				compte2.getProperty()+ "\n\tNum�ro compte : "+compte2.getNumber()+"\n\tSolde : "+compte2.getSolde());
		
		compte1.virer(compte2, 20000);
		System.out.println("Mise � jour de la base de donn�e .....................................");
		
		System.out.println("Voici les informations de la premi�re compte : \n\tPrpri�taire : "+
				compte1.getProperty()+ "\n\tNum�ro compte : "+compte1.getNumber()+"\n\tsolde : "+compte1.getSolde());
		
		System.out.println("Voici les informations de la deuxi�me compte : \n\tPropri�taire : "+
				compte2.getProperty()+ "\n\tNum�ro compte : "+compte2.getNumber()+"\n\tSolde : "+compte2.getSolde());
	}
}
