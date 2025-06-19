package reRectangle;

public class RectangleColore extends Rectangle {
	
	protected String couleur;

	public RectangleColore(double largeur, double longueur, String couleur) {
		super(largeur, longueur);
		setCouleur(couleur);
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return super.toString() + "\n couleur = " + getCouleur();
	}

	public boolean equals(RectangleColore other) {
		return super.equals(other) && this.getCouleur() == other.getCouleur() ;
	}

}
