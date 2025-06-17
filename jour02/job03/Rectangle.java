package FiguresGeometriques;

public class Rectangle {
	
	protected double largeur;
	protected double longueur;
	
	public Rectangle(double largeur, double longueur) {
		super();
		setLargeur(largeur);
		setLongueur(longueur);
	}
	
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double surface() {
		return getLargeur() * getLongueur();
	}


}
