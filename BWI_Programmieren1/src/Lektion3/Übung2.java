package Lektion3;

//Auf einer Pizzakarte werden Pizzen oft in unterschiedlichen Durchmessern (26cm, 
//28cm, 30cm) zu unterschiedlichen Preisen angeboten. Schreiben Sie ein Programm, 
//das von zwei Pizzen jeweils den Durchmesser und den Preis einliest. Das Programm 
//soll die Fläche der Pizza ausrechnen und daraufhin ausgeben, welche Pizza das 
//bessere Größen‐/Preisverhältnis hat. 
//Vorgehensweise: Belegen Sie zunächst die Variablen mit festen Werten und 
//implementieren Sie die Berechnung und die Ausgabe. Wenn alles soweit läuft, fügen 
//Sie das Einlesen der Werte hinzu. So müssen Sie nicht bei jedem Testlauf erneut die 
//Werte eingeben.

public class Übung2 {
	/**
	 * Schreiben Sie ein Programm, das von zwei Pizzen jeweils den Durchmesser und
	 * den Preis einliest. Das Programm soll die Fläche der Pizza ausrechnen und
	 * daraufhin ausgeben, welche Pizza das bessere Größen‐/Preisverhältnis hat.
	 */
	public static void run() {
		// Pizza 1
		int diameter1 = 26;
		double price1 = 8.5;
		// Pizza 2
		int diameter2 = 28;
		double price2 = 9.5;
		// Fläche der Pizza 1
		double area1 = Math.PI * Math.pow(diameter1 / 2, 2);
		// Fläche der Pizza 2
		double area2 = Math.PI * Math.pow(diameter2 / 2, 2);
		// Größen‐/Preisverhältnis der Pizza 1
		double ratio1 = area1 / price1;
		// Größen‐/Preisverhältnis der Pizza 2
		double ratio2 = area2 / price2;
		// Ausgabe
		if (ratio1 > ratio2) {
			System.out.println("Pizza 1 hat das bessere Größen‐/Preisverhältnis.");
		} else {
			System.out.println("Pizza 2 hat das bessere Größen‐/Preisverhältnis.");
		}
	}
}
