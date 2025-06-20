package GestionVehicules;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class GestionVehicules  {
	
	static class Vehicule {

		private String marque;
		private Date dateAchat;
		private double prixAchat;
		private double prixCourant;	
		
		public Vehicule(String marque, Date dateAchat, double prixAchat) {
			super();
			setMarque(marque);
			setDateAchat(dateAchat);
			setPrixAchat(prixAchat);
		}

		public String getMarque() {
			return marque;
		}
		
		public void setMarque(String marque) {
			this.marque = marque;
		}
		
		public Date getDateAchat() {
			return dateAchat;
		}
		
		public void setDateAchat(Date dateAchat) {
			this.dateAchat = dateAchat;
		}
		
		public double getPrixAchat() {
			return prixAchat;
		}
		
		public void setPrixAchat(double prixAchat) {
			this.prixAchat = prixAchat;
		}
		public double getPrixCourant() {
			return prixCourant;
		}
		
		public void setPrixCourant(double prixCourant) {
			this.prixCourant = prixCourant;
		}
		
		@Override
		public String toString() {
			return "Véhicule :\n\nMarque : " + getMarque() + "\nDate d'achat : " + getDateAchat() + "\nPrix d'achat : "
					+ getPrixAchat() + "\nPrix coutant : " + getPrixCourant() ;
		}

		public void affiche() {
			System.out.println(this.toString());
		}

		public void calculePrix(int anneeActuelle) {
			/*
				fixe le prix courant 
				au prix d'achat moins 1% par année 
				(entre la date d'achat et la date actuelle
			*/
			
			// extract year from date
			LocalDate localDate = getDateAchat().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int anneeAchat = localDate.getYear();
			int diffAnnee = anneeAchat - anneeActuelle;
			
			double prixCourant = (double) getPrixAchat() * (double)  ( (100- diffAnnee )  / 100  );
			System.out.println("Prix courant = " + prixCourant + " €");

		}
	
	}
}
