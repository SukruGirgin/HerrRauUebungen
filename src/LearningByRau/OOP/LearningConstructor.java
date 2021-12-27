package LearningByRau.OOP;

public class LearningConstructor extends LearningOOP {

    /*
        Der Konstruktor ist wie seine Klasse benannt.
        Wir haben auch einen Parameter vom Typ String den wir beim erstellen des Objekts,
        mit dem new keyword übergeben können.
     */

    private String constructorBspName = "none";
    private int ganzeZahl = 0;

    public LearningConstructor(String newConstName) {
        this.constructorBspName = newConstName;
    }

    public LearningConstructor(int newGanzeZahl) { //du kannst mehrere Constructors erstellen für eine klasse, und
        // dann bei dem jeweiligen objekt das nutzen welches du benötigst.
        this.ganzeZahl = newGanzeZahl;
    }

    public LearningConstructor(String newConstName, int newGanzeZahl) {
        this.ganzeZahl = newGanzeZahl;
        this.constructorBspName = newConstName;
    }

    public String getConstructorBspName() {
        return constructorBspName;
    }
}

/*
    - konstruktoren
    - überladen
    - Singleton special Pattern / factory Methode
 */