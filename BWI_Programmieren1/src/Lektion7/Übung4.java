package Lektion7;

//Kinder spielen gerne das B-Sprachen-Spiel. Die B-Sprache funktioniert so, dass an 
//jeden Vokal (a,e,i,o,u) eines Wortes ein b plus die Wiederholung des Vokals angefügt 
//wird. 
//Schreiben Sie eine Methode namens spielen, die ein normales Wort 
//entgegennimmt (Parameterdatentyp: String) und in ein Wort der B-Sprache 
//übersetzt und dieses zurückgibt.
//Beispiel:
//übergebene Zeichenfolge: spiel mit mir
//zurückgelieferte Zeichenfolge: spibiebel mibit mibir
//Hinweise: 
//Verwenden Sie zur Lösung der Aufgabe keine Methoden der Klasse String außer 
//toCharArray() und String.valueOf()!
//Vorgehensweise: 
//- Wandeln Sie den an die Methode übergebenen String mit toCharArray()
//in ein char-Array um! 
//- Ermitteln Sie, wie lang der zurückzugebende String sein muss und erzeugen 
//Sie ein neues char-Array der entsprechenden Länge. Speichern Sie in diesem 
//char-Array das Wort der B-Sprache. 
//- Wandeln Sie das neue char-Array mit String.valueOf() zurück in einen 
//String um und geben Sie diesen zurück

public class Übung4 {
	/**
	 * Funktion die ein normales Wort in ein Wort der B-Sprache übersetzt und dieses zurückgibt.
	 * 
	 * @param wort - Normales Wort
	 * @return
	 */
	public static String spielen(String wort) {
		int benoetigteLaenge = wort.length();
		for(int i = 0; i < wort.length(); i++) {
			if(wort.charAt(i) == 97 | wort.charAt(i) == 101 | wort.charAt(i) == 105 | wort.charAt(i) == 111 | wort.charAt(i) == 117)
				benoetigteLaenge += 2;
		}
		
		char[] wortArray = new char[benoetigteLaenge];
		int vokale = 0;
		
		for(int i = 0; i < wort.length(); i++) {
			wortArray[i+vokale] = wort.charAt(i); 
			if(wort.charAt(i) == 97 | wort.charAt(i) == 101 | wort.charAt(i) == 105 | wort.charAt(i) == 111 | wort.charAt(i) == 117) {
				vokale += 2;
				wortArray[i+vokale-1] = 'b';
				wortArray[i+vokale] = wort.charAt(i);
			}
		}
		
		return String.valueOf(wortArray);
	}
}
