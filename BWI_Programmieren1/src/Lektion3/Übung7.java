package Lektion3;

//Eine gültige Uhrzeit liegt im Intervall 00:00:00 bis 23:59:59 (hh:mm:ss). Schreiben Sie 
//ein Programm, welches drei ganzzahlige Werte von der Standardeingabe übergeben 
//bekommt. Jeweils einen Wert für Stunden, Minuten und Sekunden. 
//Das Programm zeigt auf der Standardausgabe das Ergebnis der Überprüfung mit 
//einem aussagekräftigen Text an. 

public class Übung7 {
	/**
	 * Überprüft, ob es sich bei einer eingegebenen Uhrzeit um eine gültige Uhrzeit
	 * handelt
	 */
	public static void run() {
		System.out.println("Bitte geben Sie die Stunden ein: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int hours = scanner.nextInt();
		System.out.println("Bitte geben Sie die Minuten ein: ");
		int minutes = scanner.nextInt();
		System.out.println("Bitte geben Sie die Sekunden ein: ");
		int seconds = scanner.nextInt();
		if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
			System.out.println("Die Uhrzeit " + hours + ":" + minutes + ":" + seconds + " ist gültig.");
		} else {
			System.out.println("Die Uhrzeit " + hours + ":" + minutes + ":" + seconds + " ist ungültig.");
		}
	}
}
