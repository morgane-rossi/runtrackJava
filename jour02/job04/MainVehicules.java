package GestionVehicules;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainVehicules {

	public static void main(String[] args) throws ParseException {
		
		/*
		On utilise un SimpleDateFormat pour parser une date, 
		ce qui donne une instance de java.util.Date.
		
		Le constructeur dans Voiture attend
		1 objet de type java.sql.Date
		
		On ne peut pas caster directement une java.util.Date en java.sql.Date.
		Il faut convertir java.util.Date en java.sql.Date 
		* */

		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date utilDate = sdf.parse("15-02-2021");

		java.sql.Date dateAchat = new java.sql.Date(utilDate.getTime());
		Voiture tesla = new Voiture("Tesla", dateAchat, 2000.0, 12, 4, 8000, 21000);
		System.out.println("Kilometrage = " + tesla.getKilometrage());
		System.out.println("prix achat = " + tesla.getPrixAchat());

		tesla.affiche();
		tesla.calculePrix(2025);
	}

}
