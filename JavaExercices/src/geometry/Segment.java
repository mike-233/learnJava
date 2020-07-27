package geometry;

public class Segment {
	private Point o,e;
	
	public Segment(Point origine,Point extremite){
		this.o = origine;
		this.e = extremite;
	}
	public Segment(double xOr,double yOr,double xExt,double yExt) {
		o = new Point(xOr,yOr);
		e = new Point(xExt,yExt);
	}
	public double longueur() { 
		return  Math.sqrt((e.getX() - o.getX())*(e.getX() - o.getX()) + (e.getY()-o.getY())*(e.getY()-o.getY()));
	}
	public void	deplaceOrigine	(double	dx,	double	dy) {
		o.setX(o.getX() + dx);
		o.setY(o.getY() + dy);
	}
	public void	deplaceExtremite(double	dx,	double	dy) {
		e.setX(e.getX() + dx);
		e.setY(e.getY() + dy);
	}
	public void affiche() {
		System.out.println("Les coordonnées de l'origine sont :");
		System.out.println("\tX = "+o.getX() +"\n\tY = "+o.getY());
		System.out.println("Les coordonnées de l'extremité sont ");
		System.out.println("\tX = "+e.getX() +"\n\tY = "+e.getY());
	}
	public Point getE() {
		return e;
	}
	public void setE(Point e) {
		this.e = e;
	}
	public Point getO() {
		return o;
	}
	public void setO(Point o) {
		this.o = o;
	}
}
