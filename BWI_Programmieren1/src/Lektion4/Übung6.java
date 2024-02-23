package Lektion4;

//Schreiben Sie ein Programm, welches das kleine 1x1 ausgibt. 
//Ausgabe: 
//1 x 1 = 1 
//1 x 2 = 2 
//1 x 3 = 3 
// . . .  
//2 x 1 = 2 
//2 x 2 = 4 
//2 x 3 = 6 
// . . .  
//10 x 8 = 80 
//10 x 9 = 90 
//10 x 10 = 100 
//Hinweis: Beginnen Sie damit, zunächst die ersten zehn Produkte mit Hilfe einer 
//Schleife auszugeben, d.h. 1x1=1, 1x2=2, … 1x9=9, 1x10=10.

public class Übung6 {
	/**
	 * Gibt das kleine 1x1 aus.
	 */
	public static void run() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}
}
