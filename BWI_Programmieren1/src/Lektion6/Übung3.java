package Lektion6;

//Schreiben Sie eine Methode, die ein Dreieck aus Sternen ausgibt. Die Methode soll 
//ein Argument entgegennehmen, das festlegt, wie viele Zeilen ausgegeben werden 
//sollen. In der rechten Abbildung sehen Sie eine Beispielausgabe für 5 Zeilen. 
//Beachten Sie bitte, dass zwischen den einzelnen Sternen ein Leerzeichen ausgegeben 
//wird.
//Hinweis: Versuchen Sie zunächst das Dreieck in der linken Abbildung auszugeben. 
//Passen Sie dann Ihr Programm so an, dass das Dreieck auf der rechten Seite 
//herauskommt!
//* 
//* * 
//* * * 
//* * * * 
//* * * * *
// * 
// * * 
// * * * 
// * * * * 
// * * * * *

public class Übung3 {
	/**
	 * Prints a triangle of stars
	 * 
	 * @param rows
	 */
	public static void triangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Prints a triangle of stars
	 * 
	 * @param rows
	 */
	public static void triangle2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
