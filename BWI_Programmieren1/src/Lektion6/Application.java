package Lektion6;

public class Application {

	public static void main(String[] args) {
		Übung1();
		Übung2();
		Übung3();
		Übung4();
		Übung5();
		Übung6();
	}
	
	public static void Übung1() {
		System.out.println(Übung1.round(3.2));
		System.out.println(Übung1.round(3.5));
		System.out.println(Übung1.round(3.2, 1));
		System.out.println(Übung1.round(3.5, 1));
	}
	
	public static void Übung2() {
		System.out.println(Übung2.faculty(20));
	}
	
	public static void Übung3() {
		Übung3.triangle(5);
		Übung3.triangle2(5);
	}
	
	public static void Übung4() {
		System.out.println(Übung4.isPrime(2));
	}
	
	public static void Übung5() {
		System.out.println(Übung5.power(2, 3));
	}
	
	public static void Übung6() {
		System.out.println(Übung6.jumpInMultipleJumps(4, 1, 2));
	}

}
