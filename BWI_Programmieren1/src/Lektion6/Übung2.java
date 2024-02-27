package Lektion6;

//Schreiben Sie eine Methode, welche die Fakultät mit Hilfe einer Schleife berechnet. 
//Testen Sie die Methode, indem Sie ein Programm schreiben, das vom Benutzer eine 
//Zahl einliest und mit dieser Zahl Ihre Fakultätsmethode aufruft. 
//Welche Möglichkeiten haben Sie mit größeren Zahlen umzugehen?

public class Übung2 {

	/**
	 * Calculate the faculty of a number
	 * 
	 * @param number
	 * @return
	 */
	public static int faculty(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
}
