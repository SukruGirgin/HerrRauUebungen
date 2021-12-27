package LearningByRau.ArbeitenMitDateien;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LearningDateiSpeichern {
    /*
        public static void main(String[] args) throws IOException {

        PrintWriter ausgabeDatei = new PrintWriter(new FileWriter("text.txt"));
        ausgabeDatei.println("Hallo Welt, bzw. Textdatei.");
        ausgabeDatei.close();

-- Kurze Version -> Scanner scan = new Scanner(System.in);
                    System.out.print("Bitte einen Dateinamen angeben: ");
                    PrintWriter ausgabeDatei2 = new PrintWriter(new FileWriter(scan.nextLine() + ".txt"));
                    System.out.println("Text hier angeben: ");
                    ausgabeDatei2.println(scan.nextLine());
                    ausgabeDatei2.close();

-- Lange Version -> System.out.print("Bitte einen Dateinamen angeben: ");
                    Scanner scan = new Scanner(System.in);
                    String dateiName = scan.nextLine() + ".txt";
                    PrintWriter ausgabeDatei2 = new PrintWriter(new FileWriter(dateiName));
                    System.out.println("Text hier angeben: ");
                    String inhalt = scan.nextLine();
                    ausgabeDatei2.println(inhalt);
                    ausgabeDatei2.close();
        }
     */
}
