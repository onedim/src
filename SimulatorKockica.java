//Simulira random bacanje kockica i zbraja dobivene brojeve

public class SimulatorKockica {
	public static void main(String[] args) {
		int Br1 = (int) (1 + Math.random() * 6);
		int Br2 = (int) (1 + Math.random() * 6);
		System.out.println("Prva kockica je");
		System.out.println(Br1);
		System.out.println("Drua kockica je");
		System.out.println(Br2);
		System.out.println("Ukupno je");
		System.out.println(Br1 + Br2);
	}

}