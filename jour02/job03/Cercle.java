package FiguresGeometriques;

public class Cercle extends Figure {

	protected double rayon ;

	public Cercle(double x, double y, double rayon) {
		super();
		setX(x);
		setY(rayon);
		setRayon(rayon);

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
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	// surface : double
	public double surface() {
		return getRayon() * getRayon() * Math.PI;
	}
	
	boolean estInterieur(double xPt, double yPt) {
		double distance = Math.sqrt(((xPt - getX() ) * (xPt - getX()) ) +  ((yPt - getY() ) * (yPt - getX()) ));
		return distance <= getRayon();
	}
}
