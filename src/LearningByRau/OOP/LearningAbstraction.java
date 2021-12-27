package LearningByRau.OOP;

public class LearningAbstraction extends LearningOOP {
    /*
        Bei einer Klassenhierarchie kann es vorkommen dass man verhindern möchte, dass von einer der Klassen Objekte
        erstellt werden können weil es abgeleitete Klassen gibt die spezifischer sind.
        Bsp.:
            Mitarbeiter Superklasse
                Boss, Azubi, Facharbeiter, Manager etc. Subklassen
            - ein Mitarbeiter ist stets eine dieser Kategorien und deshalb wird das Objekt immer über die Subklassen
              erstellt und die Mitarbeiter Superklasse dient lediglich dazu um Polymorphie zu machen und/oder
              Abstrakt die grundlagen der Subklassen zu definieren.
              - wobei Interfaces zu den jeweiligen punkten zusätzlich gemeinsame Eigenschaften/Methoden als zugriff
                bereitstellen.

        Keyword = abstract
            - durch dieses Keyword werden Klassen als Abstrakt gekennzeichnet.
        von Abstract Klassen können keine Objekte erstellt werden.

        public abstract class Animal {
            protected String name;
            protected int age;
            protected void eat() {
                System.out.println(this.name + " eats!");
            }
        }
     */
}
