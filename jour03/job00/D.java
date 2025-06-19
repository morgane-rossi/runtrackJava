package jour3job0;

public abstract class D extends A {
	double d;
	
	int operation(int a) {
		return(a*2);
	}
	abstract int calcul(int b) {
		/*
		 * erreur dans la classe D :
		 * c'est une méthode abstraite
		 * explication de l'erreur :
		 * une méthode abstraite ne doit pas avoir de corps
		 * */
	};
}
