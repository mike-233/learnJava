package geometry;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1,3);
		Point p2 = new Point(4,8);
		p1.affiche();
		p2.affiche();
	
		Segment s1 = new Segment(p1,p2);
		s1.affiche();
		System.out.println("On deplace l'origine");
		s1.deplaceOrigine(2,5);
		s1.affiche();
		Segment s2 = new Segment(3,4,5,6);
		s2.affiche();
		System.out.println("Longueur = "+s2.longueur());
		s2.deplaceExtremite(-2,-2);
		s2.affiche();
	}
}
