package reRectangle;

public class MainFigure {

	public static void main(String[] args) {
		
		Cercle c = new Cercle(2.5, -3, 2);
		c.affiche();
		System.out.println(c.estInterieur(2, 8));

	}

}
