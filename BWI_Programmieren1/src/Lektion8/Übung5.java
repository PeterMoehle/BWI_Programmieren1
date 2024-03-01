package Lektion8;

//Schreiben Sie eine Klasse Auto, die folgende Eigenschaften aus der Realität abbildet:
//• Marke
//• Hubraum
//• Farbe
//• weitere Merkmale, die Sie als wichtig erachten.
//Schreiben Sie weiterhin eine Klasse, in der Sie Ihre drei Lieblingsautos anlegen, d.h. 
//erstellen Sie drei Instanzen/Objekte der Klasse Auto und setzen Sie deren Attribute 
//sinnvoll.
//Ermitteln Sie das Auto mit dem größten Hubraum von den dreien (ohne das Wissen 
//welches Sie aus der Erstellung der Objekte besitzen), und geben Sie die Daten dieses 
//Autos auf der Standardausgabe aus! 

public class Übung5 {

	public static void run() {
		Auto auto1 = new Auto("BMW", 3000, "blau", "Klimaanlage");
		Auto auto2 = new Auto("Audi", 2000, "rot", "Navi");
		Auto auto3 = new Auto("Mercedes", 4000, "grün", "Automatik");

		Auto[] autos = new Auto[] { auto1, auto2, auto3 };

		Auto max = autos[0];
		for (int i = 1; i < autos.length; i++) {
			if (autos[i].hubraum > max.hubraum) {
				max = autos[i];
			}
		}
		System.out.println("Das Auto mit dem größten Hubraum ist ein " + max.marke + " mit " + max.hubraum + " ccm");
	}

	private static class Auto {
		String marke;
		int hubraum;
		String farbe;
		String merkmale;

		public Auto(String marke, int hubraum, String farbe, String merkmale) {
                    this.marke = marke;
            this.hubraum = hubraum;
            this.farbe = farbe;
            this.merkmale = merkmale;
		}
	}
}
