package Lektion4;

public class Application {

	public static void main(String[] args) {
		try {
			Übung1.run();
			Übung2.run();
			Übung3.run();
			Übung4.run();
			Übung5.run();
			Übung6.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
