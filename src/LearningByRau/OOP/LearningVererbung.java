package LearningByRau.OOP;

public class LearningVererbung extends LearningOOP {
    /*
        DRY = Don´t repeat yourself.
        Vererbung = inheritance.

        So wenig code wie möglich udn wiederholbaren code erstellen. Deshalb statt zu wiederholen, eine Subklasse
        machen und dann die Eigenschaften und Methoden vererben.
        Man erstellt eine Basisklasse und leitet davon ähnliche Klassen ab um sich doppelten Code und damit
        potentielle Fehlerquellen zu sparen.
        Auto, Boot, Flugzeug und Motorrad haben etwas gemeinsam, es sind alles Fahrzeuge.
        Alle Fahrzeuge haben nähmlich etwas gemeinsam und zwar sie haben einen Namen, eine Maximale Geschwindigkeit
        und sollen etwas Transportieren.


        Simple gesagt mit extends spar ich code und cann das erstellen von objecten sehr vereinfachen.
        Superclass vererbt an subclass die Eigenschaften und Methoden.
        Bsp.: ich benötige für alle Subclasses wie Auto, Motorrad, Boot, Flugzeug nur eine Methode in der Superclass
        Fahrzeug wo ich zB. dann die dauer der Reise berechne. oder Name, Farbe, MaxGesch etc. definiert habe.

        Bsp.:
        public class Vehicle {
            private int maxGeschw, spritVerbrauch;
            private String marke, modell;

            public void setMarke(String marke){
                this.marke = marke;
            }
            public String getMarke(){
                return this.marke;
            }
        }
        public class Car extends Vehicle {
            int courses; //gänge
            boolean autoPark;

            public Car(String marke, String modell, int maxGeschw, int courses){
                super.marke = marke;
                super.modell = modell;
                super.maxGeschw = maxGeschw;
                this.courses = courses;
            }
        }

        public static void main(String[] args){
            Car car1 = new Car();
            car1.setMarke("BMW")
            System.out.println(car1.getMarke());
            car1.courses = 5;
            car1.autoPark = true;
        }

        - Superclass vererbt(inheriting) an Subclasses
        - Subclasses haben zugriff auf Eigenschaften und Methoden der Superclass
        - keyword extends // public class SubKlasse extends SuperKlasse{}
    */
}