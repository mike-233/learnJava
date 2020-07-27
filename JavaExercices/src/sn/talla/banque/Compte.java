package sn.talla.banque;

public class Compte {
	
	private String property;
	private int number;
	private double solde;
	public Compte(String property,int number,double solde) {
		this.property = property;
		this.number = number;
		this.solde= solde;
	}
	public void crediter(double montantCrediter) {
		System.out.println("Le compte de "+this.getProperty()+" vient d'être créditer de "+montantCrediter);
		this.solde += montantCrediter;
	}
	public void debiter(double montantDebiter) {
		System.out.println("Le compte de "+this.getProperty()+" vient d'être débiter de "+montantDebiter);
		this.solde -= montantDebiter;
	}
	public void virer(Compte receiver,double montantVirer) {
		System.out.println("Le compte de "+this.getProperty()+" vient d'effectuer un virement de "+montantVirer+" sur le compte de "+receiver.property);
		this.solde -= montantVirer;
		receiver.solde += montantVirer;

	}
	public String getProperty() {
		return property;
	}
	public int getNumber() {
		return number;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
