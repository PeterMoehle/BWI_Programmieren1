package Lektion7;

//Schreiben Sie ein Programm, das die Ziehung der Lottozahlen simuliert, die Zahlen in 
//einem Feld ablegt und anschließend die gezogenen Lottozahlen nach dem in der 
//Vorlesung vorgestellten Sortier-Verfahren sortiert. Es dürfen keine doppelten 
//Lottozahlen vorliegen. Die sortierten Lottozahlen sollen anschließend ausgegeben 
//werden

public class Übung6 {
	/**
	 * Simuliert die Ziehung der Lottozahlen
	 */
	public static void run() {
		int[] lottozahlen = new int[6];
		for (int i = 0; i < lottozahlen.length; i++) {
			lottozahlen[i] = (int) (Math.random() * 49 + 1);
			for (int j = 0; j < i; j++) {
				if (lottozahlen[i] == lottozahlen[j]) {
					i--;
					break;
				}
			}
		}
		// Sortieren
		for (int i = 0; i < lottozahlen.length; i++) {
			for (int j = 0; j < lottozahlen.length - 1; j++) {
				if (lottozahlen[j] > lottozahlen[j + 1]) {
					int temp = lottozahlen[j];
					lottozahlen[j] = lottozahlen[j + 1];
					lottozahlen[j + 1] = temp;
				}
			}
		}
		// Ausgabe
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.print(lottozahlen[i] + " ");
		}
	}
}
