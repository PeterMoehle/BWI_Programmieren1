package Lektion1;

// Tauschen Sie die Inhalte der beiden Variablen, d. h. wenn vor dem Tausch x den 
// Wert 5 hatte und y den Wert 7, dann soll x nach dem Tausch den Wert 7 haben und y 
// den Wert 5. Führen Sie den Tausch so durch, dass der Tausch funktioniert, egal mit 
// welchen Werten x und y initialisiert wurden. 
// Sie dürfen nur Code zwischen den beiden Kommentaren //Tausch und //Nach dem 
// Tausch hinzufügen!

public class Übung3 {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		System.out.println("Vor dem Tausch:");
		System.out.println("x: " + x + " y: " + y);
		// Tausch
		int temp = x;
		x = y;
		y = temp;
		// Nach dem Tausch
		System.out.println("Nach dem Tausch:");
		System.out.println("x: " + x + " y: " + y);
	}

}
