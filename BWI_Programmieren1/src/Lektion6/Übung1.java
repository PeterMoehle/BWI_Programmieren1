package Lektion6;

//a) Schreiben Sie eine Methode, die eine übergebene Zahl auf- oder abrundet. 
//Beispiele: 
//3,2 wird auf 3 abgerundet
//3,5 auf 4 aufgerundet
//b) Schreiben Sie eine weitere Methode, welche eine übergebene Zahl auf eine 
//bestimmte Anzahl Nachkommastellen rundet. Die Anzahl der Nachkommastellen 
//soll anhand eines zusätzlich übergebenen Parameters bestimmt werden können.
//Hinweis: Die Verwendung sämtlicher Methoden aus der Klasse Math ist untersagt

public class Übung1 {

	public static int round(double number) {
		if (number - (int) number >= 0.5) {
			return (int) number + 1;
		} else {
			return (int) number;
		}
	}

	public static double round(double number, int decimalPlaces) {
		double factor = Math.pow(10, decimalPlaces);
		return round(number * factor) / factor;
	}
}
