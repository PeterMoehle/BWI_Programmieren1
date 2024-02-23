package Lektion4;

//Schreiben Sie ein Programm namens Temperaturumwandlung, das eine 
//Temperaturtabelle auf dem Bildschirm gemäß der Formel
//Grad Celsius = 5
//9 ∙ (Grad Fahrenheit - 32) 
//ausgibt. Die Temperaturtabelle soll in der ersten Spalte Temperaturwerte in 
//Fahrenheit (als ganze Zahl von 0 Grad Fahrenheit bis 300 Fahrenheit jeweils 
//inklusive) enthalten und in der zweiten Spalte die entsprechenden Temperaturwerte 
//in Celsius (vom Typ float) auf zwei Nachkommastellen abgeschnitten oder gerundet:
//Beispiel:
//Fahrenheit Celsius
//0 -17.78
//1 -17.22
//2 -16.67
// ...
//299 148.33
//300 148.89
//Die Spalten sollen durch ein Tabulatorzeichen getrennt werden, ansonsten muss die 
//Tabelle nicht formatiert sein.
//Die Celsiuszahl kann auf zwei Nachkommastellen abgeschnitten oder gerundet sein. 
//Recherchieren Sie, wie String.format, System.out.printf oder Math.round 
//funktionieren, um die Rundung/das Abschneiden der Nachkommastellen 
//vorzunehmen

public class Übung4 {
	/**
	 * Gib eine Temperaturtabelle aus
	 */
	public static void run() {
		System.out.println("Fahrenheit\tCelsius");
		for (int i = 0; i <= 300; i++) {
			float celsius = (float) (5.0 / 9.0 * (i - 32));
			System.out.println(i + "\t\t" + String.format("%.2f", celsius));
		}
	}
}
