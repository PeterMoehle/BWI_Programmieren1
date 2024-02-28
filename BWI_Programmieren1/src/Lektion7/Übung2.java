package Lektion7;

//In der Statistik gibt es wichtige Größen zur Beurteilung von Messreihen. Die beiden vielleicht 
//bedeutendsten Größen sind der Mittelwert (arithmetisches Mittel) und die 
//Standardabweichung.
//Das arithmetische Mittel 𝑥𝑥 wird durch folgende Formel bestimmt:
//𝑥𝑥 = 1
//𝑛𝑛�𝑥𝑥𝑖𝑖
//𝑛𝑛
//𝑖𝑖=1
//Beispiel: Der Notenspiegel von 15 Schülern sieht wie folgt aus:
//Das arithmetische Mittel (d. h. die Durchschnittsnote) berechnet sich wie folgt:
//2 ∙ 1 + 3 ∙ 2 + 5 ∙ 3 + 2 ∙ 4 + 3 ∙ 5
//15 ≈ 3,07
//Die Standardabweichung 𝑠𝑠′ ist ein Maß für die Streuung um den Mittelwert und berechnet 
//sich wie folgt:
//𝑠𝑠′ = �1
//𝑛𝑛�(𝑥𝑥𝑖𝑖 − 𝑥𝑥)2
//𝑛𝑛
//𝑖𝑖=1
//Ein Testszenario für die Aufgaben könnte wie folgt aussehen: Sie spielen Golf und üben den 
//ersten Abschlag. Nach 10 Abschlägen messen Sie, wie nah die Bälle am Loch liegen und 
//bekommen folgendes Ergebnis:
//12m, 15m, 22m, 25m, 50m, 57m, 60m, 75m, 80m, 114m
//Schreiben Sie ein Programm, das eine Messreihe (d. h. eine beliebige Anzahl von 
//Fließkommazahlen) einliest, die vom Anwender eingegeben werden. Die Anzahl der 
//einzugebenden Werte ist zu Beginn vom Benutzer einzugeben und muss größer als 0 sein. 
//Ansonsten terminiert das Programm mit einer Fehlermeldung. 
//Nachdem der Nutzer alle Werte eingegeben hat, soll das arithmetische Mittel der 
//eingegebenen Zahlen, sowie der kleinste (Minimum) und der größte Wert (Maximum). 
//Übung zum Modul Programmieren 1 Prof. Dr. Steffen Heinzl
//FHWS – Fakultät für Informatik und Wirtschaftsinformatik
//Ihre Ausgabe soll bspw. folgendermaßen aussehen:
//Anzahl der einzulesenden Werte: 5
//1. Wert: 3,14
//2. Wert: 2,67
//3. Wert: 6,71
//4. Wert: 1,45
//5. Wert: 5,23
//Kleinster Wert: 1.45
//Groesster Wert: 6.71
//Arithmetischer Mittelwert: 3.84
//Testen Sie ihr Programm mit den Werten aus obigem Szenario.
//Ergänzen Sie Ihr Programm um die Berechnung der Standardabweichung. Testen Sie Ihr 
//Programm erneut mit der Messreihe aus obigem Szenario

public class Übung2 {
	/**
	 * Berechnet das Minimum einer gegebenen Messreihe.
	 * 
	 * @param values Die Messreihe, deren Minimum berechnet werden soll.
	 * @return Das Minimum der gegebenen Messreihe.
	 */
	public static double minimum(double[] values) {
		double min = values[0];
		for (double value : values) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

	/**
	 * Berechnet das Maximum einer gegebenen Messreihe.
	 * 
	 * @param values Die Messreihe, deren Maximum berechnet werden soll.
	 * @return Das Maximum der gegebenen Messreihe.
	 */
	public static double maximum(double[] values) {
		double max = values[0];
		for (double value : values) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
	
	/**
	 * Berechnet das arithmetische Mittel einer gegebenen Messreihe.
	 * 
	 * @param values Die Messreihe, deren arithmetisches Mittel berechnet werden
	 *               soll.
	 * @return Das arithmetische Mittel der gegebenen Messreihe.
	 */
	public static double arithmetischesMittel(double[] values) {
		double sum = 0;
		for (double value : values) {
			sum += value;
		}
		return sum / values.length;
	}

	/**
	 * Berechnet die Standardabweichung einer gegebenen Messreihe.
	 * 
	 * @param values Die Messreihe, deren Standardabweichung berechnet werden soll.
	 * @return Die Standardabweichung der gegebenen Messreihe.
	 */
	public static double standardabweichung(double[] values) {
		double mean = arithmetischesMittel(values);
		double sum = 0;
		for (double value : values) {
			sum += Math.pow(value - mean, 2);
		}
		return Math.sqrt(sum / values.length);
	}
}
