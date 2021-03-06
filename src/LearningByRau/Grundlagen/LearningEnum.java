package LearningByRau.Grundlagen;

enum WeekDay { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
enum Cards { CLUBS, SPADES, HEARTS, DIAMONDS }

public class LearningEnum {
    public void weekDayEnum() {
        WeekDay day = WeekDay.MONDAY;
        System.out.println(day);
    }

    public void anwendungsBeispiel() {
        String message = "";
        WeekDay day = WeekDay.FRIDAY;
        switch (day) {
            case MONDAY:
                message = "Tag fürs freiwillige Fasten";
            case TUESDAY:
                message = "Freier Tag!";
            case WEDNESDAY:
                message = "Willy ich komme!";
            case THURSDAY:
                message = "Wieder erneut freiwillig Fasten!";
            case FRIDAY:
                message = "It´s Cumaah! = Allahumma Salli alá Rasuline Muhammed (saw)";
            case SATURDAY:
                message = "Sohbet Tag!";
            case SUNDAY:
                message = "Nachbarschaft und Familie!";
        }
        System.out.println(message);
    }

    public void planetenBeispiel() {
        enum Planet {
            MERCURY(3.303e+23, 2.4397e6),
            VENUS(4.869e+24, 6.0518e6),
            EARTH(5.976e+24, 6.37814e6),
            MARS(6.421e+23, 3.3972e6),
            JUPITER(1.9e+27, 7.1492e7),
            SATURN(5.688e+26, 6.0268e7),
            URANUS(8.686e+25, 2.5559e7),
            NEPTUNE(1.024e+26, 2.4746e7);

            private final double mass;   // in kilograms
            private final double radius; // in meters

            Planet(double mass, double radius) {
                this.mass = mass;
                this.radius = radius;
            }
        }
    }
    public void enumArtikelNummer(){
        enum Artikel {
            MILCH (0001, 0.79),
            EIWEISSBROT (0002, 1.39),
            KLOPAPIER (0003, 2.79),
            TOMATEN (0004, 1.89),
            CHIPS (0005, 0.89);

            private final int artNr;    //Artikel Nummer
            private final double preis; // in Euro €

            Artikel(int artNr, double preis) {
                this.artNr = artNr;
                this.preis = preis;
            }
        }

        Artikel kauft = Artikel.CHIPS;
        double gegeben = 10;
        double restgeld = gegeben - kauft.preis;
        if (kauft.preis < 1)
            System.out.println("Artikel kostet:   " + "0" + kauft.preis + "€");
        else
            System.out.println("Artikel kostet:   " + kauft.preis + "€");
        System.out.println("Bezahlt:          " + gegeben + "0€");
        if (restgeld < 10)
            System.out.println("Restgeld beträgt: " + "0" + restgeld + "€");
        else
            System.out.println("Restgeld beträgt: " + restgeld + "€");
    }

}
