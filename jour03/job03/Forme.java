package progAmateur;

public abstract class Forme {
	
	private String couleur ;
	
	public Forme(String uneCouleur) {
		this.couleur = uneCouleur;
	}
	/*
	public Forme(Forme other) {
		this.couleur = other.couleur;
	}*/
	
	public String getCouleur() {
		return couleur;
	}
	
	public abstract void dessine() ;

}
