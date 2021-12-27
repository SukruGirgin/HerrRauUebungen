package LearningByRau.OOP;

public class LearningPolymorphie extends LearningOOP {
    /*  (Super: Mitarbeiter / Sub: Boss, Azubi;
        in eine Superclass auch ein Subclass initialisieren, yani in ein Elternobjekt ein Kinderobjekt einfügen.
        Mitarbeiter b2 = new Boss("Harald", 150000, "AudiA7");
        statt
        Boss boss2 = new Boss("Harald", 150000, "AudiA7");

        Nützlich um unterschiedliche Objekte zu haben aber trotzdem gemeinsames array.

        public static void main(String[] args){
            Mitarbeiter m1 = new Mitarbeiter("Müller", 35000, "BMW");
            Boss b1 = new Boss("Hans", 250000, "Benz")
            Azubi a1 = new Azubi("Frederick", 23500, 24h (Firma), 16h (Schule), 2. Jahr, Bahncard)
            b1.fuehren();
            a1.arbeiten();
            Mitarbeiter b2 = new Boss("Harald", 150000, "AudiA7");

            // Mitarbeiter dieMit[] = {b2, m1, b1, a1};
            oder:
            Mitarbeiter dieMit[] = new Mitarbeiter[4];
            dieMit[0] = b1;
            dieMit[1] = b2;
            dieMit[2] = m1;
            dieMit[3] = a1;
            dieMit[4] = new Azubi("Micha", 22000, 18h, 16h, 1. Jahr, "Fahrrad");

            for(int i = 0; i < dieMit.length; i++){
                dieMit[i].arbeiten();
        }

        2. dient dazu um Methoden zu Überladen.
        Bsp.:

            int arbeitsstunden;
            public void arbeiten()
                {sout("Arbeitsstd: " + arbeitsstunden)}
            public void arbeiten(int arbeitsstunden)
                {sout("Arbeitsstd: " + arbeitsstunden)}
     */

/*
        Polymorphischen Parameter:
            "Wie wir einen Parameter verwenden vom Typen eines Objektes / Klasse, und dabei aber auch die Subclasses
            akzeptiert."


        public class Main {
            public static class Mitarbeiter {
                String name, firmenWagen;
                int jahresGehalt, abreitsStd;
                public void Mitarbeiter(String name, int jahresGehalt, String firmenWagen){
                    this.name = name;
                    this.jahresGehalt = jahresGehalt;
                    this.firmenWagen = firmenWagen;
                }
                public void arbeiten() {
                    System.out.println("Ich Arbeite!");
                }
            }

            public static class Boss extends Mitarbeiter {
                public void Boss(String name, int jahresGehalt, String firmenWagen){
                    super.name = name;
                    super.jahresGehalt = jahresGehalt;
                    super.firmenWagen = firmenWagen;
                }
                public void arbeiten() {
                    System.out.println("Ich mache Boss sachen!");
                }
                public void fuehren() {
                    System.out.println("Ich Manage!");
                }
            }
            public static class Azubi extends Mitarbeiter {
                int schulStd;

                public void Azubi(String name, int jahresGehalt, int arbeitsStd, int schulStd){
                    super.name = name;
                    super.jahresGehalt = jahresGehalt;
                    super.abreitsStd = arbeitsStd;
                    this.schulStd = schulStd;
                }
                public void arbeiten() {
                    System.out.println("Ich lerne neues!");
                }
            }
            public static class Consultant {
--Objct Prmtr-> public void fragt(Mitarbeiter mitarbeiter){
                    mitarbeiter.arbeiten();
                }
            }

            public static void main(String[] args){
                Mitarbeiter m1 = new Mitarbeiter();
                Boss b1 = new Boss();
                Azubi a1 = new Azubi();
                Mitarbeiter b2 = new Boss();

                Mitarbeiter dieMit[] = {b2, m1, b1, a1, new Azubi()};
                oder:
                Mitarbeiter dieMit[] = new Mitarbeiter[4];
                dieMit[0] = b1;
                dieMit[1] = b2;
                dieMit[2] = m1;
                dieMit[3] = a1;
                dieMit[4] = new Azubi();
                System.out.println();

                Consultant c1 = new Main.Consultant();
                System.out.println("Ab hier Consulting: ");
--Objct Prmtr-> c1.fragt(b2);
                c1.fragt(m1);
                c1.fragt(a1);
                c1.fragt(dieMit[4]);
                System.out.println();

                System.out.println("Ab hier Schleifenabfrage: ");
                for(int i = 0; i < dieMit.length; i++){
                    dieMit[i].arbeiten();
                }

            }
        }


        Polymorphie ist wenn du mit einem Subobjekt ein Superobjekt erstellst.
            - Mitarbeiter boss3 = new Boss("Günther", 48, 220000, "AudiQ7")
        Und innerhalb von Methoden(Parametern) ein Objekt initialisierst.
            - public void abfragen(Mitarbeiter mitarbeiter)
            - in diese Mitarbeiter Objekt Parameter, kann ich durch Polymorphie auch ein Boss objekt initialisieren.
                denn die Boss Klasse ist eine Subclass von der Mitarbeiter Superclass.
*/

}
