package sn.mike.programme;

public class Strawberry extends Fruit {

	public Strawberry(String name) {
		super("Fraise");
	}
	@Override
	public void taste() {
		System.out.println("Le go�t est plut�t sucr�");
	}
	@Override
	public int getSize() {
		return 1;
	}
	@Override
	public boolean hasSeed() {
		return false;
	}
}
