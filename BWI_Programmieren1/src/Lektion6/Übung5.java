package Lektion6;

//Aufgabe: Rekursion
//Schreiben Sie eine Methode, die xn rekursiv berechnet! Testen Sie ihre Methode, 
//indem vom Anwender Basis und Exponenten eingeben lassen. Anschließend soll Ihre 
//Methode mit diesen Werten aufgerufen und das Ergebnis auf der Standardausgabe 
//angezeigt werden.
//Hinweis: Machen Sie sich hierbei die mathematische Definition der Potenz zunutze:
//𝑥𝑥0 ≔ 1, 𝑥𝑥𝑛𝑛+1 ≔ 𝑥𝑥𝑛𝑛 ∙ 𝑥𝑥, wobei 𝑥𝑥 𝜖𝜖 ℝ, 𝑛𝑛 𝜖𝜖 ℕ

public class Übung5 {
	/**
	 * This method is responsible for calculating the power of a number
	 * 
	 * @param base     The base number
	 * @param exponent The exponent
	 * 
	 * @return The result of the power
	 */
	public static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * power(base, exponent - 1);
	}
}
