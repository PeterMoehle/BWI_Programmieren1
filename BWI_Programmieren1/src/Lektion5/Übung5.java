package Lektion5;

//Schreiben Sie ein Programm, das die Zahl π mittels der in der Vorlesung 
//besprochenen Rechtecknäherung annähert. Der Benutzer soll die Anzahl der zu 
//verwendenden Rechtecke eingeben können.
//Wählen Sie einen geeigneten Schleifentyp (while, for, do-while) für die Implementierung!

public class Übung5 {
	/*
	 * Berechnet die Zahl Pi und gibt das Ergebnis aus.
	 */
	public static void run() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Geben Sie die Anzahl der zu verwendenden Rechtecke ein: ");
		int n = scanner.nextInt();
		double pi = 0;
		double a = 1.0 / n;
		for (int i = 0; i < n; i++) {
			double x = a * (i + 0.5);
			pi += 4.0 / (1 + x * x);
		}
		pi *= a;
		System.out.println("Berechneter Wert: " + pi);
		System.out.println("Math.PI: " + Math.PI);
		scanner.close();
	}
}
