package Lektion2;

// Schreiben Sie ein Programm, das – bei gegebenen Radius r eines Kreises – die 
// Kreisfläche (r2) und den Kreisumfang (2r) berechnet und auf der Standardausgabe 
// mit Hinweistext ausgibt.  
// Wie groß wäre das Volumen, falls es sich statt eines Kreises um eine Kugel handelte 
// (ସଷ𝜋𝑟ଷ)? Berechnen Sie das Volumen und geben Sie es aus! Sie können die Kreis‐ und 
// die Kugelberechnungen im gleichen Programm stattfinden lassen.

public class Übung1 {
	/** Berechnet die Fläche und den Umfang eines Kreises sowie das Volumen einer Kugel */
	public static void run() {
		double r = 5;
		double flaeche = Math.PI * r * r;
		double umfang = 2 * Math.PI * r;
		double volumen = (4 * Math.PI * r * r * r) / 3;
		System.out.println("Kreisfläche: " + flaeche);
		System.out.println("Kreisumfang: " + umfang);
		System.out.println("Kugelvolumen: " + volumen);
	}
}
