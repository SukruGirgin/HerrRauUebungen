package LearningByRau.Grundlagen;

public class LearningSwitchCase {

    int uhrzeit;
    String name;
    String geschlecht;


    public void übung2() {

        uhrzeit = 13;
        name = "Sükrü Girgin";
        geschlecht = "Männlich";

        if (uhrzeit < 9) {
            switch (geschlecht) {
                case "Männlich" :
                    System.out.println("Guten Morgen Herr " + name);
                    break;
                case "Weiblich" :
                    System.out.println("Guten Morgen Frau " + name);
                    break;
            }
        } else if (uhrzeit > 10 && uhrzeit < 17) {
            switch (geschlecht) {
                case "Männlich":
                    System.out.println("Guten Tag Herr " + name);
                    break;
                case "Weiblich":
                    System.out.println("Guten Tag Frau " + name);
                    break;
            }
        } else if (uhrzeit > 18) {
            switch (geschlecht) {
                case "Männlich":
                    System.out.println("Guten Abend Herr " + name);
                    break;
                case "Weiblich":
                    System.out.println("Guten Abend Frau " + name);
                    break;
            }
        }
    }

}
