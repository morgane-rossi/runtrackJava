package GestionVehicules;

import java.sql.Date;
import GestionVehicules.GestionVehicules.Vehicule;

public class Avion extends Vehicule {
	
	String typeMoteur;
	int nbHeuresVol;
	
	public Avion(String marque, Date dateAchat, double prixAchat, String typeMoteur, int nbHeuresVol) {
		super(marque, dateAchat, prixAchat);
		setTypeMoteur(typeMoteur);
		setNbHeuresVol(nbHeuresVol);
	}

	public String getTypeMoteur() {
		return typeMoteur;
	}

	public void setTypeMoteur(String typeMoteur) {
		this.typeMoteur = typeMoteur;
	}

	public int getNbHeuresVol() {
		return nbHeuresVol;
	}

	public void setNbHeuresVol(int nbHeuresVol) {
		this.nbHeuresVol = nbHeuresVol;
	}

	@Override
	public String toString() {
		return super.toString() + "\nType de moteur :" + getTypeMoteur() + "\nNombre d'heures de vol :" + getNbHeuresVol()  ;
	}

	@Override
	public void calculePrix(int anneeActuelle) {

		// cas du navion à helices
		int pourcentage ;
		if(getTypeMoteur() == "helices") {
			pourcentage = getNbHeuresVol()/10;
		}
		
		// cas des autres moteurs
		else {
			pourcentage = getNbHeuresVol()/100;
		}
		double prixCourant = getPrixAchat() * ( (100 - pourcentage ) / 100 );
		System.out.println("Prix courant = " + prixCourant + " €");
	}
	
	
}
