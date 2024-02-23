package Lektion4;

//Eine Primzahl ist eine natürliche Zahl größer 1, die nur durch sich selbst und durch 1 teilbar 
//ist.
//a) Schreiben Sie ein Programm, welches für eine vom Benutzer eingegebene ganze Zahl 
//ermittelt, ob diese eine Primzahl ist.
//Beispiel 1:
//Bitte zu untersuchende Zahl eingeben: 47
//Untersuchte Zahl ist eine Primzahl!
//Beispiel 2:
//Bitte zu untersuchende Zahl eingeben: 51
//Untersuchte Zahl ist keine Primzahl!
//b) Modifizieren Sie ihr Programm so, dass für alle Zahlen bis zur eingegebenen Zahl 
//überprüft wird, ob es sich um Primzahlen handelt.

public class Übung3 {
	/**
	 * Untersucht, ob eine Zahl eine Primzahl ist.
	 */
	public static void run() {
		boolean isPrime = true;
		System.out.println("Bitte zu untersuchende Zahl eingeben: ");
		int number = new java.util.Scanner(System.in).nextInt();
		if (number <= 1) {
			System.out.println("Untersuchte Zahl ist keine Primzahl!");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Untersuchte Zahl ist eine Primzahl!");
		} else {
			System.out.println("Untersuchte Zahl ist keine Primzahl!");
		}
	}
}
