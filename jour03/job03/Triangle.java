package progAmateur;

public class Triangle extends Forme {
	
	public Triangle(String uneCouleur) {
		super(uneCouleur);
	}

	@Override
	public void dessine() {
		System.out.println("Une forme " + getCouleur());
		System.out.println("toute pointue");
	}
}
