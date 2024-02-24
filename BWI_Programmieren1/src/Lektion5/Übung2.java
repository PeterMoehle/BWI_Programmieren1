package Lektion5;

//Schreiben Sie ein Programm, das die Potenz bn berechnet und das Ergebnis auf der 
//Standardausgabe anzeigt. Sowohl die Basis b, als auch der Exponent n werden über die 
//Standardeingabe (b vom Typ double, n vom Typ int) eingelesen.
//In Abhängigkeit vom Exponenten n gilt für bn:
//𝑏𝑏𝑛𝑛 ≔
//⎩
//⎪
//⎪
//⎨
//⎪
//⎪
//⎧𝑏𝑏
//��∙�𝑏𝑏�∙ …��∙
//�𝑏𝑏
//𝑛𝑛−𝑚𝑚𝑚𝑚𝑚𝑚
//, für 𝑛𝑛 > 0
//1, für 𝑛𝑛 = 0
//1
//𝑏𝑏
//��∙�𝑏𝑏�∙ …��∙�𝑏𝑏
//𝑛𝑛−𝑚𝑚𝑚𝑚𝑚𝑚
//, für 𝑛𝑛 < 0
//Wählen Sie einen geeigneten Schleifentyp (while, for, do-while) für die Implementierung!
//Hinweis: Bei dieser Aufgabe dürfen die Klasse Math und deren Methoden nicht
//verwendet werden

public class Übung2 {
	/*
	 * Berechnet die Potenz b^n und gibt das Ergebnis aus.
	 */
	public static void run() {
		double b = 0;
		int n = 0;
		double result = 1;
		System.out.println("Geben Sie die Basis ein: ");
		b = new java.util.Scanner(System.in).nextDouble();
		System.out.println("Geben Sie den Exponenten ein: ");
		n = new java.util.Scanner(System.in).nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				result *= b;
			}
		} else if (n < 0) {
			for (int i = 0; i > n; i--) {
				result *= 1 / b;
			}
		}
		System.out.println(result);
	}
}
