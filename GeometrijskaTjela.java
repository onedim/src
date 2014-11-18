
public class GeometrijskaTjela {

	public static void main(String[] args) {
		int Stranica = 5;
		double Radius = Stranica / 2.0;
		double Nasumice = (0.5 + Math.random() * 36.2);
		System.out.println ("Površina kvadrata");
		System.out.println (Stranica * Stranica);	
		System.out.println ("Zapremina Kocke");
		System.out.println (Stranica * Stranica * Stranica);
		System.out.println ("Površina kruga");
		System.out.println (Radius * Radius * Math.PI);
		System.out.println ("Radius kruga");
		System.out.println (2 * Radius * Math.PI);
		System.out.println ("Koliko puta može stati radius kruga u površinu kvadrata");
		System.out.println ((int)(Radius * Radius * Math.PI/Stranica * Stranica));
		System.out.println ("Zapremina valjka");
		System.out.println (Radius * Radius * Math.PI * Nasumice);
		
		
		
	}

}
