package LearningByRau.OOP;

public class LearningInterfaces extends LearningOOP {
    /*
        Schnittstellen für die Implementierung:
        Keyword: implements

        interface Animal {
            public void eat(); //No Syntax
        }

        interface kann nur statische Variablen oder Methoden Signaturen anlegen.
        Im Interface hat eine Methode keinen Body, der Inhalt der Methode kommt durch die Klasse, die das Interface
        implementiert.

        public class Animal {
            String color;
        }
        interface Eat {
            public void eat(); //No Syntax
        }
        interface Flying {
            public void fly();
        }
        class Bird extends Animal implements Eat, Flying {
            public void Bird(String color){
                super.color = color;
            }
            public void eat() {
                //Now we can add some functionality
                System.out.println("The bird eats its food");
            }
            public void fly() {
                System.out.println("The bird is flying!");
            }
        }

        - Interfaces müssen vollständig implementiert werden.
            - Man darf keien einzige Methode/Eigenschaft auslassen.
        - Eine Klasse kann mehrere Interfaces implementieren.
        - die Funktionalität des Interfaces wird von der Klasse gegeben
            - das interface ist nur der Rahmen.
     */
}
