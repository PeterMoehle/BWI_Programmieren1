package Lektion7;

//In Ihrem Büro steht ein Schreibtisch, in dem sich mit 50%er Wahrscheinlichkeit ein 
//Euro befindet. Dieser Schreibtisch hat drei Schubladen. Wenn sich ein Euro in diesem 
//Schreibtisch befindet, dann befindet er sich mit je gleicher Wahrscheinlichkeit in 
//einer der Schubladen. Wie groß ist die Wahrscheinlichkeit dafür, dass sich der Euro 
//im dritten Schubfach befindet, wenn im ersten und im zweiten bereits vergeblich 
//nach ihm gesucht wurde?
//a) (optional) Überlegen Sie sich mathematisch (bspw. mit bedingten 
//Wahrscheinlichkeiten), wie groß die Wahrscheinlichkeit ist.
//b) Schreiben Sie ein Programm, dass obigen Ablauf simuliert und bestimmen Sie die 
//Wahrscheinlichkeit näherungsweise mit 10000 Durchläufen Ihres Programms

public class Übung5 {
	/**
	 * Berechnet die Wahrscheinlichkeit dafür, dass sich der Euro im dritten Schubfach
	 * befindet, wenn im ersten und im zweiten bereits vergeblich nach ihm gesucht wurde.
     *
	 */
	public static void run() {
		int n = 10000;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					count++;
				}
			}
		}
		System.out.println("Wahrscheinlichkeit: " + (double) count / n);
	}
}
