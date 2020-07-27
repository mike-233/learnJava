package sn.mike.programme;

public class PineApple extends Fruit implements PeelFruit{
	private boolean peeled = false;
	public PineApple() {
		super("Ananas"); // ici on cible le constructeur du superclasse
	}
	public void taste() {
		System.out.println("L'ananas a un gout un peu acide");
	}
	public int getSize() {
		return 2;
	}
	public boolean hasSeed() {
		return false;
	}
	@Override
	public boolean ispeeled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getSkinType() {
		// TODO Auto-generated method stub
		return "Piquante";
	}
}
