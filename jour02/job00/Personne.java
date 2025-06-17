package jour_deux;

import java.sql.Date;

public class Personne {

	public String nom;
	public String prenom;
	protected Date dateDeNaissance;
	protected String lieuDeNaissance;
	private String adresse;
	private String telephone ;

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}
	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/*
	Quelles sont les différences de ces différents types d’attributs ?

	# public :
	visible par toutes les classes du même projet
	
	# protected :
	visible uniquement par la classe elle même, et par les classes qui héritent
	de la classe Personne
	
	# private :
	visible uniquement par classe Personne


	Pour quels types a-t-on besoin d’accesseurs : getter et setter ?
	pour les types protected & private 
	 */
}
