package sn.mike.programme;

public class MainFruit {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.taste();
		a.niam();
		PineApple pen = new PineApple();
		
		pen.taste();
		pen.niam();
		if(!(a instanceof PeelFruit)) {
			System.out.println("Ce fruit n'implemente pas l'interface PeelFruit ");
		}else 
			System.out.println(a.getName()+" implemente de l'interface PeelFruit");
	}
}
