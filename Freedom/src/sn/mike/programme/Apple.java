package sn.mike.programme;

public class Apple extends Fruit implements PeelFruit{
	public Apple() {
		super("Pomme");
	}
	public void taste() {
		System.out.println("La pomme a un goût plutôt sucré");
	}
	public int getSize() {
		return 1;
	}
	public boolean hasSeed() {
		return true;
	}
	@Override
	public boolean ispeeled() {
		return false;
	}
	@Override
	public String getSkinType() {
		return "Lisse";
	}
}
