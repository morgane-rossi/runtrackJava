package reRectangle;

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

	@Override
	public String toString() {
		return "Rectangle :\n largeur = " + getLargeur() + "\n longueur = " + getLongueur();
	}
	
	public boolean equals(Rectangle other) {
		if(this == null && other == null)return true ;
		if(this == null || other == null)return false ;
		return (this.getClass() == other.getClass() && this.getLargeur() == other.getLargeur()) &&  (this.getLongueur() == other.getLongueur());
	}

}
