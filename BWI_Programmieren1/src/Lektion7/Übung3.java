package Lektion7;

//Schreiben Sie eine Methode inGrossbuchstaben, die ein char-Array entgegennimmt. 
//Die Methode soll alle Kleinbuchstaben in dem char-Array in Großbuchstaben 
//umwandeln und zurückgeben. Alle anderen Zeichen sollen unverändert bleiben.
//Hinweis: Nehmen Sie den ASCII-Code/Unicode zu Hilfe

public class Übung3 {
	/**
	 * Wandelt alle Kleinbuchstaben in dem char-Array in Großbuchstaben um und
	 * 
	 * @param arr char-Array
	 * @return char-Array
	 */
	public static char[] inGrossbuchstaben(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}
		}
		return arr;
	}
}
