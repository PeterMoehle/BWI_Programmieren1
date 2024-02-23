package Lektion4;

//Die zurückgelegte Strecke eines frei fallenden Körpers berechnet sich nach folgender 
//Formel: 
//𝑠ሺ𝑡ሻ ൌ ଵ
//ଶ 𝑔∙𝑡ଶ, wobei g die Fallbeschleunigung (9.80665 ௠
//௦మ) darstellt und 𝑡 die 
//vergangene Zeit in Sekunden.  
//a) Schreiben Sie ein Programm, welches die zurückgelegte Strecke im Sekundentakt, 
//wie im Beispiel gezeigt, ausgibt. Die Falldauer soll vom Benutzer eingegeben
//werden. 
//Beispiel: 
//Bitte Falldauer in Sekunden eingeben:   
//Zeit: 1 Sekunden: Zurückgelegte Strecke: 4.903325 m 
//Zeit: 2 Sekunden: Zurückgelegte Strecke: 19.6133 m 
//.... 
//Zeit: 8 Sekunden: Zurückgelegte Strecke: 313.8128 m 
//b) Modifizieren Sie das Programm, so dass nur für jede fünfte Sekunde eine Ausgabe 
//erfolgt! Beginnen Sie bei der Ausgabe mit der ersten Sekunde, gefolgt von der 
//sechsten Sekunde, … 
//Hinweis: Wenn Sie eine Ausgabe wünschen, die sekündlich auf dem Bildschirm 
//erscheint, verwenden Sie bitte Thread.sleep (millis) wie in der Countdown‐Aufgabe.

public class Übung2 {

	public static void run() throws InterruptedException {
		double g = 9.80665;
		System.out.println("Bitte Falldauer in Sekunden eingeben: ");
		int t = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i <= t; i++) {
			double s = 0.5 * g * (i * i);
			if (i % 5 == 0) {
				System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + s + " m");
			}
			Thread.sleep(1000);
		}
	}
}
