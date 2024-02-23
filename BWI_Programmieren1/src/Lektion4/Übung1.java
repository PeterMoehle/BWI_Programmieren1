package Lektion4;

//a) Schreiben Sie ein Programm, das einen Countdown von 15 bis 0 herunterzählt und 
//jeweils die verbleibende (Sekunden-)zahl ausgibt.
//b) (optional) Wenn Sie einen echten Countdown implementieren wollen, müssen Sie 
//sekündlich herunterzählen. Dies ist durch den Befehl Thread.sleep(millis) möglich. Er 
//legt das Programm für millis Millisekunden schlafen, bevor die nächste Anweisung 
//ausgeführt wird, erzwingt aber die Behandlung einer InterruptedException. Sie 
//können bei dieser Aufgabe einfach die Exception ignorieren, indem Sie hinter dem 
//Kopf der main-Methode throws InterruptedException ergänzen:

public class Übung1 {
	/**
	 * Zählt von 15 bis 0 herunter und gibt die verbleibende Sekundenzahl aus.
	 * 
	 * @throws InterruptedException
	 */
	public static void run() throws InterruptedException {
		for (int i = 15; i >= 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
