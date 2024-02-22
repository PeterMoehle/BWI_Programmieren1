package Lektion3;

//Schreiben Sie ein Programm, das ein Einzelzeichen einliest.  
//Ist das Einzelzeichen 
// ein Großbuchstabe, soll das Wort "Großbuchstabe" ausgegeben werden.  
// eine hexadezimale Ziffer (d.h. '0' – '9', 'a' – 'f'  oder  'A' – 'F'), dann soll 
//„Hexadezimale Ziffer“ ausgegeben werden. 
// eine binäre Ziffer, dann soll „binäre Ziffer“ ausgegeben werden
// eine Ziffer im Oktalsystem, dann soll „oktale Ziffer“ ausgegeben werden 
//Fällt ein Einzelzeichen in mehrere Kategorien, sollen alle passenden Ausgaben 
//erscheinen. Fällt ein Einzelzeichen in keine der Kategorien, soll die Ausgabe 
//„Unbekannt“ erfolgen.

public class Übung3 {
	/**
	 * Einlesen von einem Einzelzeichen und Ausgabe der Kategorie
	 */
	public static void run() {
		System.out.println("Bitte geben Sie ein Einzelzeichen ein: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		char ch = scanner.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			System.out.println("Großbuchstabe");
		}
		if (Character.isDigit(ch)) {
			if (Character.isDigit(ch) && (ch >= '0' && ch <= '7')) {
				System.out.println("oktale Ziffer");
			}
			if (Character.isDigit(ch) && (ch >= '0' && ch <= '1')) {
				System.out.println("binäre Ziffer");
			}
			if (Character.isDigit(ch) && (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f')
					|| (ch >= 'A' && ch <= 'F')) {
				System.out.println("Hexadezimale Ziffer");
			}
		}
		if (!Character.isUpperCase(ch) && !Character.isDigit(ch)) {
			System.out.println("Unbekannt");
		}
	}
}
