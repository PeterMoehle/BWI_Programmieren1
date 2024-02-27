package Lektion6;

//Schreiben Sie eine Methode springeInMehrerenSpruengen, die als Paramater eine 
//Distanz (in Meter) und zwei Sprungweiten (in Meter) übergeben bekommt. Die 
//Methode soll die Anzahl der Möglichkeiten zurückgeben, in der die Distanz durch die 
//beiden unterschiedlichen Sprungweiten zurückgelegt werden kann.
//Beispiel 1: 
//Der Aufruf springeInMehrerenSpruengen(4,1,2) muss 5 zurückgeben, denn es gibt 
//die folgenden 5 Möglichkeiten, die Weite von 4 Metern mit 1‐ und 2‐Meter‐
//Sprüngen zurückzulegen: 
//1 1 1 1 
//1 1 2 
//1 2 1 
//2 1 1 
//2 2   
//Beispiel 2: 
//Der Aufruf springeInMehrerenSpruengen(5,2,3) muss 2 zurückgeben, denn es gibt 
//die folgenden 2 Möglichkeiten, die Weite von 5 Metern mit 2‐ und 3‐Meter‐
//Sprüngen zurückzulegen: 
//2 3 
//3 2

public class Übung6 {
	/**
	 * This method is responsible for jumping in multiple jumps
	 * 
	 * @param distance The distance to be jumped
	 * @param jump1    The first jump
	 * @param jump2    The second jump
	 * 
	 * @return int The amount of possibilities to jump the distance
	 */
	public static int jumpInMultipleJumps(int distance, int jump1, int jump2) {
		if (distance == 0) {
			return 1;
		}
		if (distance < 0) {
			return 0;
		}
		return jumpInMultipleJumps(distance - jump1, jump1, jump2)
				+ jumpInMultipleJumps(distance - jump2, jump1, jump2);
	}
}
