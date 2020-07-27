package sn.mike.programme;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String name) {
		super("fruit");
	}
	@Override
	public void taste() {
		System.out.println("Le goût est plutôt sucré niam niam");
	}
	@Override
	public int getSize() {
		return 1;
	}
	@Override
	public boolean hasSeed() {
		return false;
	}
	@Override
	public boolean ispeeled() {
		return true;
	}
	@Override
	public String getSkinType() {
		return "Doux";
	}
}
