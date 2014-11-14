
public class IzračunavanjeKamate {
	public static void main (String [] args) {
		double Glavnica = 10000;
		double Kamata = (Math.random()*0.15);
		System.out.println ("Ukupno sa kamatom");
		System.out.println (Glavnica * Kamata + Glavnica);
		System.out.println ("Glavnica je");
		System.out.println (Glavnica);
		System.out.println ("Kamata je");
		System.out.println (Kamata);
	}

}
