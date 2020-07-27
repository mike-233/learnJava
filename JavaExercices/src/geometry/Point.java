package geometry;

public class Point {
	
	private double x,y; 
	
	public	Point(double x, double	y)	{
		this.x = x	;	
		this.y = y	;} 
	public void  deplace (double dx, double dy)	{
		x = this.getX() + dx;
		y = this.getY() + dy;
		}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public	void affiche(){
		System.out.println("coordonnees	= "	+ this.getX() + " " + this.getY());
		} 
}
