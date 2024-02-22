package Lektion3;

//a) Schreiben Sie ein Programm, dem zwei Einzelzeichen (Datentyp char) über die 
//Standardeingabe übergeben werden. Die zwei Zeichen repräsentieren bool‘sche 
//Werte: Zeichen ‘f‘ für false und Zeichen ‘t‘ für true. 
//In Abhängigkeit von dieser Eingabe wird ein int-Wert mit Hinweistext auf der 
//Standardausgabe angezeigt. Die Abhängigkeit ist der folgenden Tabelle zu 
//entnehmen:
//1. Zeichen 2. Zeichen Ausgabewert
//false false 0
//false true 1
//true false 2
//true true 3
//Wird keine gültige Kombination eingegeben, so wird eine aussagekräftige 
//Fehlermeldung auf der Standardausgabe angezeigt.
//b) (optional) Recherchieren Sie, wie Sie eine RuntimeException mit aussagekräftiger 
//Fehlermeldung werfen. Werfen Sie die RuntimeException anstelle der Ausgabe 
//aussagekräftigen Fehlermeldung

public class Übung8 {
	/**
	 * Einlesen von zwei Einzelzeichen als boolsche Werte und 
	 * Ausgabe des Ausdrucks der logischen Verknüpfung
	 */
	public static void run() {
		System.out.println("Bitte geben Sie das erste Einzelzeichen ein: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		char ch1 = scanner.next().charAt(0);
		System.out.println("Bitte geben Sie das zweite Einzelzeichen ein: ");
		char ch2 = scanner.next().charAt(0);
		if (ch1 == 'f' && ch2 == 'f') {
			System.out.println(0);
		} else if (ch1 == 'f' && ch2 == 't') {
			System.out.println(1);
		} else if (ch1 == 't' && ch2 == 'f') {
			System.out.println(2);
		} else if (ch1 == 't' && ch2 == 't') {
			System.out.println(3);
		} else {
			throw new RuntimeException("Ungültige Eingabe");
		}
	}
}
