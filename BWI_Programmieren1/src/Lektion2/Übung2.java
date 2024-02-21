package Lektion2;

// Zur Lösung quadratischer Gleichungen der Form x2 + px + q = 0 wird die pq‐Formel 
// verwendet: 
// 𝑥ଵ,ଶ ൌ െ 𝑝2 േ ඨቀ2ቁଶെ 𝑞
// Schreiben Sie ein Programm, das bei Angabe der Variablen p und q die beiden 
// Lösungen für x ausrechnet! Achten Sie darauf, beim Test Ihres Programms darauf, 
// dass Sie eine Belegung für p und q so wählen, dass unter der Wurzel kein negativer 
// Wert steht. 
// Recherchieren Sie mit einer Suchmaschine, mit welchem Befehl in Java eine Wurzel 
// gezogen werden kann.

public class Übung2 {
	/** Berechnet die Lösungen für x aus einer quadratischen Gleichung */
	public static void run() {
		double p = 5;
		double q = 7;
		double x1 = (-p + Math.sqrt(p * p - 4 * q)) / 2;
		double x2 = (-p - Math.sqrt(p * p - 4 * q)) / 2;
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}
}
