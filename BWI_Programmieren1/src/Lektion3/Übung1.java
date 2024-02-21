package Lektion3;

//a) Schreiben Sie ein Programm, welches vom Benutzer eine ganze Zahl einliest und mithilfe 
//des Modulo‐Operators überprüft, ob die Zahl ganzzahlig durch 7 teilbar ist. Anschließend 
//soll eine entsprechende Ausgabe auf der Standardausgabe erfolgen. 
//b) Erklären Sie in wenigen Sätzen: 
//Was passiert,  
//‐ wenn der Modulo‐Operator auf negative Operanden  
//angewendet wird? 
//‐ wenn der Modulo‐Operator auf Kommazahlen angewendet wird? 
//Ist das Ergebnis sinnvoll?

public class Übung1 {
	/**
	 * Schreiben Sie ein Programm, welches vom Benutzer eine ganze Zahl einliest
	 * und mithilfe des Modulo‐Operators überprüft, ob die Zahl ganzzahlig durch 7
	 * teilbar ist. Anschließend soll eine entsprechende Ausgabe auf der
	 * Standardausgabe erfolgen.
	 */
	public static void run() {
		System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
		int number = new java.util.Scanner(System.in).nextInt();
		if (number % 7 == 0) {
			System.out.println("Die Zahl " + number + " ist durch 7 teilbar.");
		} else {
			System.out.println("Die Zahl " + number + " ist nicht durch 7 teilbar.");
		}
	}
}
