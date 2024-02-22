package Lektion3;

//Der Befehl Math.random() gibt eine zufällige double‐Zahl zwischen 0 (inklusive) und 
//1 (exklusive) zurück. Für eine zurückgegebene Zahl x gilt also 𝑥 ∈ ሾ0. .1ሻ. 
//Simulieren Sie den Wurf eines 6‐seitigen Würfels. Wenn eine 1 gewürfelt wurde, soll 
//der Text „Eins gewürfelt“ ausgegeben werden, bei einer 2 „Zwei gewürfelt“, etc.

public class Übung4 {
	/**
	 * Berechnet eine Zufallszahl zwischen 1 und 6 und gibt den entsprechenden Text aus
	 */
	public static void run() {
		int number = (int) (Math.random() * 6 + 1);
		switch (number) {
		case 1:
			System.out.println("Eins gewürfelt");
			break;
		case 2:
			System.out.println("Zwei gewürfelt");
			break;
		case 3:
			System.out.println("Drei gewürfelt");
			break;
		case 4:
			System.out.println("Vier gewürfelt");
			break;
		case 5:
			System.out.println("Fünf gewürfelt");
			break;
		case 6:
			System.out.println("Sechs gewürfelt");
			break;
		}
	}
}
