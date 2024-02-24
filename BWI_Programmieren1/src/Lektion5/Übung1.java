package Lektion5;

//Gegeben Sei die Reihe  
//𝑎௞ ൌ6∙෍ 1
//𝑘ଶ
//ஶ
//௞ୀଵ
//a) Schreiben Sie die ersten fünf Glieder der Reihe auf Papier auf!
//b) Schreiben Sie ein Programm, welches die Reihe berechnet und das Ergebnis bei 
//jedem Schleifendurchlauf ausgibt. Brechen Sie die Berechnung ab, wenn die 
//Änderung des Reihenwertes in einem Schleifendurchlauf kleiner als 10‐5 ist.  
//c) Welche Auswirkungen hat es auf die Berechnung, wenn der Faktor 6 vor der 
//Reihe steht bzw. in der Reihe steht? 

public class Übung1 {
	/*
	 * Berechnet die Reihe a = 6 * (1 / k^2) und gibt das Ergebnis aus.
	 */
	public static void run() {
		double a = 0;
		double oldResult = 0;
		double diff = 0;
		int k = 1;
		do {
			oldResult = a;
			a = oldResult + 6 * (1 / Math.pow(k, 2));
			diff = Math.abs(a - oldResult);
			System.out.println(a);
			k++;
		} while (diff > 0.00001);
	}
}
