package Lektion8;

import java.util.Scanner;

//Entwickeln Sie das Spiel Galgenmännchen. Der Benutzer soll eines von 20 im 
//Programm vordefinierten Wörtern als Unterstriche angezeigt bekommen.  
//Beispiel: 
//Im Programm wurde das Wort „PROGRAMMIERSPRACHE“ ausgewählt. Der Benutzer 
//bekommt folgende Anzeige 
//1. Versuch: _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
//und darf jetzt einen Buchstaben eingeben. Groß‐ und Kleinschreibung soll nicht 
//unterschieden werden. Bei jeder Eingabe wird die Anzahl der Versuche hochgezählt. 
//Wenn er also ein ‚z‘ eingibt, erfolgt folgende Ausgabe: 
//2. Versuch: _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  
//Gibt er einen Buchstaben ein, der im Wort vorhanden ist, wird jedes Vorkommen des 
//Buchstabens angezeigt. Gibt bspw. der Benutzer ein ‚m‘ ein: 
//3. Versuch: _ _ _ _ _ _ M M _ _ _ _ _ _ _ _ _ _  
//Nach dem 15. Versuch oder wenn das Wort komplett erraten wurde, sollen keine 
//weiteren Eingaben erfolgen und das Programm mit einer entsprechenden Ausgabe 
//beenden. 
//Hinweis: Mit der Methode toCharArray() kann ein String in ein char[]
//umgewandelt werden:  
//String sentence = …
//char[] chars = sentence.toCharArray()

public class Übung1 {

	public static void run() {
		String[] worte = {"Programmiersprache", "Baum", "Apfel", "Java", "Affe", "Elefant", "Truthahn"};
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		
		char[] wort = worte[(int)(Math.random() * worte.length)].toCharArray();
		char[] anzeige = new String( "_ ").repeat(wort.length).toCharArray();
		
		do
		{
			System.out.println(index + ". Versuch: " + String.copyValueOf(anzeige));
			System.out.printf("Eingabe eines neues Wertes: ");
			char input = scanner.next().charAt(0);
			
			for(int i = 0; i < wort.length; i++)
			{
				if(Character.toUpperCase(wort[i]) == Character.toUpperCase(input))
				{
					anzeige[i*2] = wort[i];
				}
			}
			
		} while (++index <= 15 & String.copyValueOf(anzeige).contains("_ "));
		scanner.close();
		
		System.out.println("----------\n" + String.copyValueOf(wort));
	}
}
