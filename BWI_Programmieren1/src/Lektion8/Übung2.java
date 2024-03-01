package Lektion8;

//Schreiben Sie ein Programm, dem bei Programmstart zwei Zahlen auf der 
//Kommandozeile/Terminal als Argumente übergeben werden. Die Zahlen sollen dann 
//miteinander multipliziert werden und das Ergebnis ausgegeben werden. Überprüfen 
//Sie, ob genau zwei Argumente bei Programmstart mitgegeben werden, ansonsten 
//soll eine aussagekräftige Fehlermeldung angezeigt werden

public class Übung2 {
	public static void run(String[] args) {
		if (args.length != 2) {
			System.out.println("Es müssen genau zwei Argumente übergeben werden!");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a * b);
	}
}
