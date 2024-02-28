package Lektion7;

//Schreiben Sie eine Methode, die den Sinus berechnet. Der Sinus kann durch folgende 
//Reihe berechnet werden: 
//sinሺ𝑥ሻ ൌ ෍ሺെ1ሻ௞ 𝑥ଶ௞ାଵ
//ሺ2𝑘 ൅ 1ሻ!
//ஶ
//௞ୀ଴
//Schreiben Sie zunächst die ersten fünf Glieder der Summe auf (auf ihr Lösungsblatt)!  
//Testen Sie Ihre Methode, indem vom Anwender der Wert x abgefragt und 
//eingegeben wird. Anschließend wird die Methode aufgerufen und das Ergebnis auf 
//der Standardausgabe angezeigt. 
//Hinweis: Gehen Sie analog zur Berechnung des Cosinus im Vorlesungsskript vor. Die 
//Verwendung von Methoden aus der Klasse Math aus der Java‐Bibliothek ist 
//untersagt!

public class Übung1 {
	/**
	 * Berechnet den Sinus eines gegebenen Winkels.
	 * 
	 * @param x Der Winkel, dessen Sinus berechnet werden soll.
	 * @return Der Sinus des gegebenen Winkels.
	 */
	public static double sin(double x) {
		double result = 0;
		for (int k = 0; k < 5; k++) {
			double numerator = Math.pow(-1, k) * Math.pow(x, 2 * k + 1);
			double denominator = factorial(2 * k + 1);
			result += numerator / denominator;
		}
		return result;
	}

	/**
	 * Berechnet den Fakultätswert einer gegebenen Zahl.
	 * 
	 * @param n Die Zahl, deren Fakultät berechnet werden soll.
	 * @return Die Fakultät der gegebenen Zahl.
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
