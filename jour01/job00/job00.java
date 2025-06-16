package jour_un;

public class job00 {

	public static void main(String[] args) {
		
		char a = 'a';
		String bonjour = "Bonjour";

		/* Il est impossible de stocker directement la valeur 3.817 dans un int
		il faut caster vers int */
		int TOTO = (int)3.817;
		
		long grandNombre = 1544;
		float pi = 3.14f;
		boolean faux = false;
		
		System.out.println("valeur de a : " + a);
		System.out.println("valeur de bonjour : " + bonjour);

		// va afficher 3 car nécessite cast vers type int
		System.out.println("valeur de TOTO : " + TOTO);

		System.out.println("valeur de grandNombre : " + grandNombre);
		System.out.println("valeur de pi : " + pi);
		System.out.println("valeur de faux : " + false);
	}

}
