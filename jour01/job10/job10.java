package jour_un;

public class job10 {

	public static int factorielle(int n)
	{
		if (n == 1) {
			return n ;
		}
		return n * factorielle(n-1);
	}
	
	public static void main(String[] args) {
	
		System.out.println("factorielle de 8 = " + factorielle(8));
	}
}
