package Lektion7;

public class Application {

	public static void main(String[] args) {
        Übung1();
        Übung2();
        Übung3();
		Übung4();
		Übung5();
		Übung6();
	}
	
	public static void Übung1() {
		double x = 0;
		double result = 0;
		System.out.println("Eingabe x:");
		x = new java.util.Scanner(System.in).nextDouble();
		result = Übung1.sin(x);
		System.out.println("Berechnet: sin(" + x + ") = " + result);
		System.out.println("Erwartet: sin(" + x + ") = " + Math.sin(x));
	}
	
	public static void Übung2() {
		double[] values = { 3.14, 2.67, 6.71, 1.45, 5.23 };
		System.out.println("Kleinster Wert: " + Übung2.minimum(values));
		System.out.println("Größter Wert: " + Übung2.maximum(values));
		System.out.println("Arithmetisches Mittel: " + Übung2.arithmetischesMittel(values));
		System.out.println("Standardabweichung: " + Übung2.standardabweichung(values));
	}
	
	public static void Übung3() {
		char[] arr = { 'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h', 'I', 'j', 'K', 'l', 'M', 'n', 'O', 'p', 'Q', 'r', 'S',
				't', 'U', 'v', 'W', 'x', 'Y', 'z' };
		System.out.println(Übung3.inGrossbuchstaben(arr));
	}
	
	public static void Übung4() {
		System.out.println(Übung4.spielen("spiel mit mir"));
	}
	
	public static void Übung5() {
		Übung5.run();
	}
	
	public static void Übung6() {
		Übung6.run();
	}
}
