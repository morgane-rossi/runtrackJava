package jour_deux;

public class Toto {
	
	int toto = 0 ;
	Toto(){
		toto = toto + 1 ;
	}
	
	public static void main(String[] args) {
		Toto t1 = new Toto();
		Toto t2 = new Toto();
		
		System.out.println("Toto: " + toto);
	}
}
/*
	Erreur du compilateur : 
	"Cannot make a static reference to the non-static field toto"
 * 
 * "toto" est un attribut, lorsqu'il est utilisé dans System.out.println
 * il n'appartient à aucune instance
 * */