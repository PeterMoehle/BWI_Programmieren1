package Lektion8;

//Stellen Sie sich vor, Sie haben eine Wikipedia-Webseite heruntergeladen und den body in 
//einer String-Variablen gespeichert.
//Der String könnte dann folgendermaßen aussehen:
//String seite = "<body id=\"www-wikipedia-org\">"
//+ "<div class=\"central-textlogo\">"
//+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
//+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
//+ "</div>"
//+ "</body>";
//In untenstehenden Programm ist der String bereits eingefügt. Schneiden Sie mit Hilfe von 
//String-Methoden die URL des Bildes (den Wert des Attributs src des Elements img) heraus. 
//Schauen Sie sich dazu die String-Methoden indexOf() und substring() an!
//Wenn Sie die URL richtig ausgeschnitten haben, lädt das Programm das Bild in den Ordner, 
//aus dem es gestartet wurde.
//Aus Eclipse heraus gestartet, landet das Bild in Ihrem Eclipse Projekt. Aktualisieren Sie Ihr 
//Projekt (rechte Maustaste auf das Projekt und Refresh), damit Sie die neue Datei sehen.
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import javax.imageio.ImageIO;
//public class SaveImageFromURL
//{
// public static void main(String[] args) throws IOException
// {
// String seite = "<body id=\"www-wikipedia-org\">"
// + "<div class=\"central-textlogo\">"
// + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
// + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
// + "</div>"
// + "</body>";
// <ihren Ausschneide-Code hier einfügen>
// String downloadUrl = <ihre ausgeschnittene URL>
// URL url = new URL(downloadUrl);
// BufferedImage image = ImageIO.read(url);
// ImageIO.write(image, "png", new File("bild.png"));
// }
//}

public class Übung4 {
	public static void run() {
		String seite = "<body id=\"www-wikipedia-org\">" + "<div class=\"central-textlogo\">"
				+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
				+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">" + "</div>" + "</body>";
		String url = seite.substring(seite.indexOf("https"), seite.indexOf("png") + 3);
		System.out.println(url);
	}
}
