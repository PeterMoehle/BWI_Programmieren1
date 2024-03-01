package Lektion8;

//Schreiben Sie ein Programm, dass beliebig viele Zahlen als Argumente bei Programmstart 
//übergeben bekommen kann. Zusätzlich wird als letztes Argument der Operator „+“ oder „-“ 
//übergeben. Führen Sie eine Addition bzw. eine Subtraktion auf alle übergebenen Zahlen aus 
//und geben Sie das Ergebnis aus. Bei einer Subtraktion soll von der ersten Zahl subtrahiert 
//werden.
//Sie können davon ausgehen, dass immer mindestens zwei Zahlen übergeben werden und 
//dass nur die Operatoren + und - übergeben werden.
//Beispiel für eine Klasse mit Namen Parameteruebergabe:
//java Parameteruebergabe 1 2 3 +
//6 
//java Parameteruebergabe 10 2 3 –
//5

public class Übung3 {
	public static void run(String[] args) {
		if (args.length < 3) {
			System.out.println("Es müssen mindestens zwei Zahlen und ein Operator übergeben werden!");
			return;
		}
		int result = Integer.parseInt(args[0]);
		for (int i = 1; i < args.length - 1; i++) {
			int number = Integer.parseInt(args[i]);
			if (args[args.length - 1].equals("+")) {
				result += number;
			} else {
				result -= number;
			}
		}
		System.out.println(result);
	}
}
