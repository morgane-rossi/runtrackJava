package TGCM;

import java.util.Vector;

public class Magic {
	
	abstract class Carte {	
		
		Vector<Couleur> cout;

		public Carte(Couleur[] cout) {
			super();
			this.cout = new Vector<Couleur>();
			System.out.println("Type de la carte : " + this.getClass());
		}

		public Couleur[] getCout() {
			return cout;
		}

		public void setCout(Couleur[] cout) {
			this.cout = cout;
		}

		@Override
		public String toString() {
			String representation = "Cout de la carte = ";
			for(Couleur c : cout) {
				representation += c.toString() + " ";
			}
			return representation;
		}
	}

	enum Couleur {
		BLANC,
		BLEU,
		NOIR,
		ROUGE,
		VERT
	}
	
	class Terrain extends Carte {	
		Couleur couleur;
		
		public Terrain(Couleur[] cout, Couleur couleur) {
			super(cout);
			super.setCout(null);
			setCouleur(couleur);
		}

		public Couleur getCouleur() {
			return couleur;
		}

		public void setCouleur(Couleur couleur) {
			this.couleur = couleur;
		}

		@Override
		public String toString() {
			return super.toString() + "\nCouleur du terrain : " + getCouleur().toString();
		}
	}
	
	class Creature extends Carte {
		
		String nom;
		int nbPtsDegats;
		int nbPtsVie;

		public Creature(Couleur[] cout, String nom, int nbPtsDegats, int nbPtsVie) {
			super(cout);
			setNom(nom);
			setNbPtsDegats(nbPtsDegats);
			setNbPtsVie(nbPtsVie);
		}

		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNbPtsDegats() {
			return nbPtsDegats;
		}
		public void setNbPtsDegats(int nbPtsDegats) {
			this.nbPtsDegats = nbPtsDegats;
		}
		public int getNbPtsVie() {
			return nbPtsVie;
		}
		public void setNbPtsVie(int nbPtsVie) {
			this.nbPtsVie = nbPtsVie;
		}

		@Override
		public String toString() {
			return super.toString() + "\nNom de la créature : " + getNom() + "\nDommages : "
			+ getNbPtsDegats() + "\nNombre de points de vie :"	+ getNbPtsVie();
		}
	}
	
	class Sortilege extends Carte {

		String nom;
		String explication;
				
		public Sortilege(Couleur[] cout, String nom, String explication) {
			super(cout);
			setNom(nom);
			setExplication(explication);

		}

		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public String getExplication() {
			return explication;
		}
		
		public void setExplication(String explication) {
			this.explication = explication;
		}
		
		@Override
		public String toString() {
			return super.toString() + "\nNom du sortilège : " + getNom() + "\nDétails : "
			+ getExplication();
		}
	}

}
