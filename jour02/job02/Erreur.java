package jour_deux;

public class Erreur {

	public static void main(String[] args) {

/*
	Le programme Erreur ci-dessous définit les classes E1, E2, E3, E4, E5 et Erreur.
	Pour chacune des 5 instructions d'affichage dans la méthode main, 
	indiquez  si l'instruction est correcte ou fausse. 
	Compilez et corrigez le programme pour vérifier vos réponses * 
 * */
		E1 x = new E1(); 
		E2 y = new E2();
		E3 z = new E3();
		E4 v = new E4();
		E5 w = new E5();
		
		// instruction correcte
		System.out.println(x.a);
		
		// instruction fausse
		System.out.println(y.c);
		// instruction correcte
		System.out.println(y.b);
		
		// instruction correcte
		System.out.println(z.b);

		// instruction fausse/
		System.out.println(v.c);
		// instruction correcte
		System.out.println(v.d);
		
		// instruction correcte
		System.out.println(w.a);
		
	}
}

class E1 {
	int a = 1 ;
}

class E2 extends E1 {
	int b = 2 ;
}

class E3 extends E2 {
	int c = 3 ;
}

class E4 extends E1 {
	int d = 4;
}

class E5 extends E4 {
	int e = 5 ;
}