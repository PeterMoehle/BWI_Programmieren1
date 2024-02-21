package Lektion2;

//Schreiben Sie ein Programm, das die Variablen stunden, minuten und sekunden
//enthält. Initialisieren Sie die Variablen manuell mit der aktuellen Uhrzeit, d.h. wenn 
//gerade 12:30 Uhr ist, weisen Sie der Variablen stunden 12, der Variable minuten 30 
//und der Variablen sekunden 0 zu. 
//a) Berechnen Sie die Anzahl der Sekunden seit Mitternacht und geben Sie diese aus! 
//b) Berechnen Sie die Anzahl der verbleibenden Sekunden für diesen Tag und geben 
//Sie diese aus! 
//c) Berechnen Sie, wie viel Prozent des Tages schon vergangen sind und geben Sie 
//das Ergebnis aus! Die Prozentangabe soll auf mehrere Nachkommastellen genau 
//angegeben werden.   
//d) (weiterführend) Initialisieren Sie die Variablen mit der Systemzeit. Verwenden
//Sie LocalTime.now(). Recherchieren Sie, welche Methodenaufrufe Ihnen der 
//Aufruf von LocalTime.now() zur Verfügung stellt.

public class Übung3 {
	/**
	 * Berechnet die Anzahl der Sekunden seit Mitternacht, die verbleibenden
	 * Sekunden und den Prozentsatz des Tages, der bereits vergangen ist
	 */
	public static void run() {
		int stunden = 12;
		int minuten = 30;
		int sekunden = 0;
		int sekundenSeitMitternacht = stunden * 3600 + minuten * 60 + sekunden;
		int verbleibendeSekunden = 24 * 3600 - sekundenSeitMitternacht;
		double prozentVergangen = (double) sekundenSeitMitternacht / (24 * 3600) * 100;
		System.out.println("Sekunden seit Mitternacht: " + sekundenSeitMitternacht);
		System.out.println("Verbleibende Sekunden: " + verbleibendeSekunden);
		System.out.println("Prozent des Tages vergangen: " + prozentVergangen);
	}
}
