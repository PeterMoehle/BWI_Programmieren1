package Lektion6;

//Schreiben Sie eine Methode, die überprüft, ob es sich bei einer übergebenen Zahl 
//um eine Primzahl handelt. Die Methode soll true zurückgeben, falls es sich bei der 
//übergebenen Zahl um eine Primzahl handelt, ansonsten false. 
//Modifizieren Sie Ihr Primzahl-Programm aus Lektion 4 so, dass die von Ihnen 
//geschriebene Methode verwendet wird, anstatt die Primzahlberechnung direkt in 
//der main-Methode vorzunehmen.

public class Übung4 {
	/**
	 * This method checks if a number is a prime number
	 * 
	 * @param number
	 * @return boolean
	 */
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
