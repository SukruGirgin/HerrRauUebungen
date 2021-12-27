package LearningByRau.OOP;

public class LearningÜberladenÜberschreiben extends LearningOOP {
    /*
        Beim Überladen von Methoden gibt es mehrere Methoden,
        mit demselben Namen und unterschiedlichen Parameterlisten in ein und derselben Klasse.
        Beim Überschreiben von Methoden gibt es mehrere Methoden,
        mit demselben Namen und derselben Parameterliste in unterschiedlichen Klassen.

        Überladen innerhalb ein und der selben class (Superclass & Subclass)
        Überschreiben zwischen Subclasses (untereinander) und Superklasse mit Subclasses,

        public class Human {
            String name;
            int alter;

            public Human(String name, int alter) {
                this.name = name;
                this.alter = alter;
            }
            public Human (String name) {
                this.name = name; //beispiel für Überladen
            }
            public String getInfo() {
                return "Name: " + this.name + " Alter: " + this.alter;
            }
        }

        public class Lehrer {
            String fach;

            public Lehrer(String fach) {
                super(name, alter);
                this.fach = fach;
            }

            public String getInfo() { // Beispiel für Überschreiben
                return super.getInfo() + " Fach: " + this.fach;
            }
        }

        public static void main(String[] args) {
            Lehrer lehrer1 = new Lehrer("Thorsten Bäcker", 48, "Mathe");
            System.out.println(lehrer1.getInfo());
        }
    */
}
