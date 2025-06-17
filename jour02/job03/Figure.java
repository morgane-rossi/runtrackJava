package FiguresGeometriques;

public abstract class Figure {
	
	protected double x ;
	protected double y ;

	public void affiche() {
		System.out.println("Cercle :\nCoordonnées du centre : x : " + getX() + " - y : " + getY() + "\nRayon : " + getRayon());
	}

	protected abstract double getRayon();
	protected abstract double getY();
	protected abstract double getX();	
	
}
