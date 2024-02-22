package Lektion3;

//Schreiben Sie ein Programm, das überprüft, ob es sich bei einer eingegebenen 
//Jahreszahl um ein Schaltjahr handelt.  
//Eine Grundvoraussetzung für ein Schaltjahr ist: 
// es muss ganzzahlig durch 4 teilbar sein 
//Hierbei ist folgende Ausnahme zu berücksichtigen: 
// es darf nicht ganzzahlig durch 100 teilbar sein 
// falls es jedoch ganzzahlig durch 400 teilbar ist, handelt es sich um ein Schaltjahr 
//Das Ergebnis der Überprüfung soll mit einem aussagekräftigen Hinweistext auf der 
//Standardausgabe angezeigt werden. 
//Beispiele für ein/kein Schaltjahr: 
//‐ 2005   ist kein Schaltjahr, da nicht ganzzahlig durch 4 teilbar 
//‐ 2004   ist ein Schaltjahr, da ganzzahlig durch 4 teilbar 
//‐ 1900   ist kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht 
//durch 400 
//‐ 2000   ist ein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber auch  
//durch 400

public class Übung6 {
	/**
	 * Überprüft, ob es sich bei einer eingegebenen Jahreszahl um ein Schaltjahr
	 * handelt
	 */
	public static void run() {
		System.out.println("Bitte geben Sie eine Jahreszahl ein: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
				} else {
					System.out.println("Das Jahr " + year + " ist kein Schaltjahr.");
				}
			} else {
				System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
			}
		} else {
			System.out.println("Das Jahr " + year + " ist kein Schaltjahr.");
		}
	}
}
