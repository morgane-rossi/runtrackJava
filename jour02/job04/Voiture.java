package GestionVehicules;


import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

import GestionVehicules.GestionVehicules.Vehicule;

public class Voiture extends Vehicule {

	private int cylindree;
	private int nbPortes;
	private int puissance;
	private double kilometrage;

	public Voiture(String marque, Date dateAchat, double prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage) {
		super(marque, dateAchat, prixAchat);
		setCylindree(cylindree);
		setNbPortes(nbPortes);
		setPuissance(puissance);
		setKilometrage(kilometrage);
	}

	public int getCylindree() {
		return cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCylindrée : " + getCylindree() + "\nNombre de portes : " + getNbPortes() + "\nPuissance : "
			+ getPuissance() + "\nKilométrage : " + getKilometrage();
	}
	
	@Override
	public void calculePrix(int anneeActuelle) {
		
		// avoir année à partir de la date d'achat
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDateAchat());
		int anneeAchat = calendar.get(Calendar.YEAR);
		int diffAnnee = anneeActuelle - anneeAchat ;
		
		double prixCourant = getPrixAchat() *  (100 - (diffAnnee*2) ) / 100;
		int trancheKm = (int) (getKilometrage()/10000);
		for (int i = 0 ; i < trancheKm; i++) {
			prixCourant *= 0.95;
		}
		if(getMarque() ==  "Renault" || getMarque() == "Fiat") {
			prixCourant *= 0.9;
		}
		else if(getMarque() == "Ferrari" || getMarque() == "Porsche") {
			prixCourant *= 0.8;
		}
		
		if(prixCourant < 0) {
			prixCourant = 0 ;
		}
		System.out.println("Prix courant = " + prixCourant + " €");
	
	}
}
