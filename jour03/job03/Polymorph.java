package progAmateur;

import java.util.Vector;

public class Polymorph {

	public static void main(String[] args) {
		
		/*   */
		Vector<Forme> tabFormes = new Vector<>();
		tabFormes.add(new Cercle("rouge"));
		tabFormes.add(new Triangle("jaune"));
		
		for (int i = 0 ; i < tabFormes.size() ; i++) {
			tabFormes.get(i).dessine();			
		}
	}

}

/*
 * Question 2 :
 * le programme affiche
 * 
" Une forme rouge
Une forme jaune"
 * */
 