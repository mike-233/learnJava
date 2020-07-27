package sn.mike.programme;

public abstract class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void niam() {
		System.out.println("Manger 5 fruits et légumes par jour / nom du fruit :"+getName());
	}

	public String getName() {
		return name;
	}
}
