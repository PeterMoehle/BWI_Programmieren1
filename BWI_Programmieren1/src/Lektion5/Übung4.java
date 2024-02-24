package Lektion5;

//a) Schreiben Sie ein Programm, das die Quadratwurzel nach dem in der Lektion 
//vorgestellten Verfahren berechnet.
//b) Vergleichen Sie die Genauigkeit Ihres Verfahrens nach 10, 100, 1000 und 10000 
//Durchläufen mit dem Ergebnis der Methode Math.sqrt.
//Wählen Sie einen geeigneten Schleifentyp (while, for, do-while) für die Implementierung

public class Übung4 {
	/*
	 * Berechnet die Quadratwurzel und gibt das Ergebnis aus.
	 */
	public static void run() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Geben Sie eine positive Zahl ein, um die Quadratwurzel zu berechnen: ");
        double zahl = scanner.nextDouble();

        if (zahl < 0) {
            System.out.println("Negative Zahlen haben im Reellen keine Quadratwurzel.");
        } else {
        	double epsilon = 1e-10; // Die Genauigkeit der Annäherung
            double t = zahl; // Startwert für die Iteration

            // Newton-Raphson Iteration weil Unbekannt, welcher Verwendet werden soll
            while (Math.abs(t - zahl / t) > epsilon * t) {
                t = (zahl / t + t) / 2.0;
                System.out.println(t);
            }
            double quadratwurzel = t;
            System.out.printf("Die Quadratwurzel von %.3f ist ungefähr: %.8f%n", zahl, quadratwurzel);
            System.out.printf("Die Quadratwurzel von %.3f ist genau: %.8f%n", zahl, Math.sqrt(zahl));
        }

        scanner.close();
	}
}
