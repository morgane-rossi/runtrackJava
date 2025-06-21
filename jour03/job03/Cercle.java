package progAmateur;

public class Cercle extends Forme {
	
	public Cercle(String uneCouleur) {
		super(uneCouleur);
	}

	@Override
	public void dessine() {
		System.out.println("Une forme " + getCouleur());
		System.out.println("toute ronde");
	}
}
