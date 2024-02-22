package Lektion3;

//Schreiben Sie ein Programm, das überprüft, ob es sich bei einer eingegebenen Zahl 
//um eine gültige Matrikelnummer handelt. Eine gültige Matrikelnummer ist 
//siebenstellig und beginnt je nach Studiengang mit 50xxxxx, 51xxxxx oder 61xxxxx. 
//Auf den verbleibenden 5 Stellen können beliebige Ziffern stehen. Das Ergebnis der 
//Überprüfung wird durch einen aussagekräftigen Text auf der Standardausgabe 
//angezeigt.

public class Übung5 {
	/**
	 * Überprüft, ob es sich bei einer eingegebenen Zahl um eine gültige
	 * Matrikelnummer handelt
	 */
	public static void run() {
		System.out.println("Bitte geben Sie eine Matrikelnummer ein: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String number = scanner.next();
		if (number.length() == 7) {
			if (number.startsWith("50") || number.startsWith("51") || number.startsWith("61")) {
				System.out.println("Die Matrikelnummer " + number + " ist gültig.");
			} else {
				System.out.println("Die Matrikelnummer " + number + " ist ungültig.");
			}
		} else {
			System.out.println("Die Matrikelnummer " + number + " ist ungültig.");
		}
	}
}
