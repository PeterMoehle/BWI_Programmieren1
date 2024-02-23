package Lektion4;

//Schreiben Sie ein Programm namens Querprodukt, welches das „Querprodukt“
//einer int-Zahl berechnet und dieses mit einer Meldung am Bildschirm anzeigt. Das 
//Einlesen der int-Zahl soll von der Standardeingabe solange wiederholt werden, bis 
//sie gültig ist, d.h. zwischen 1 und einer Million (jeweils inklusive) liegt. Bei Eingabe 
//einer ungültigen int-Zahl soll zusätzlich eine Fehlermeldung erscheinen und ein 
//erneutes Einlesen erfolgen.
//Beispiel:
//Geben Sie bitte eine Zahl ein: -3
//FEHLER – Zahl ist ungueltig.
//Geben Sie bitte eine Zahl ein: 1348213
//FEHLER – Zahl ist ungueltig.
//Geben Sie bitte eine Zahl ein: 3225
//Das Querprodukt der Zahl 3225 betraegt 60

public class Übung5 {
	/**
	 * Berechnet das Querprodukt einer Zahl.
	 */
	public static void run() {
		int number = 0;
		while (true) {
			System.out.print("Geben Sie bitte eine Zahl ein: ");
			number = new java.util.Scanner(System.in).nextInt();
			if (number >= 1 && number <= 1000000) {
				break;
			} else {
				System.out.println("FEHLER – Zahl ist ungueltig.");
			}
		}
		int result = 1;
		int temp = number;
		while (temp > 0) {
			result *= temp % 10;
			temp /= 10;
		}
		System.out.println("Das Querprodukt der Zahl " + number + " betraegt " + result);
	}
}
