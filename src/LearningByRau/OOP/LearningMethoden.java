package LearningByRau.OOP;

public class LearningMethoden extends LearningOOP {

    public void vorstellen(String name, String nachname, int alter, String religion){
        System.out.println("Assalamun aleykum wa Rahmatullah akhi, mein name ist " + name + " " + nachname + " ich " +
                "bin " + alter + " Jahre alt und " + religion + ".");
    }

    String name2, nachname2, religion2;
    private int alter;

    public void SetAlter(int alter) {
        this.alter = alter;
    }

    public void vorstellen2(){
        System.out.println("Assalamun aleykum wa Rahmatullah akhi, mein name ist " + name2 + " " + nachname2 + " ich " +
                "bin " + alter + " Jahre alt und " + religion2 + ".");
    }




    /*
    //Klasse erstesProjekt.AutoHaus
    String standort;
    NeueAutos autoFürHalle;

    public void autoHinzufügen(NeueAutos auto) {

        autoFürHalle = auto;

    }

    AutoHaus autoHinzu = new AutoHaus();
    autoHinzu.standort = "Bergedorf";

    NeueAutos audiA8 = new NeueAutos();
    audiA8.hersteller = "VW";
    audiA8.gebraucht = "gebraucht";
    audiA8.km = 18000;
    audiA8.marke = "Audi A8";
    audiA8.schäden = "Keine Schäden";
    audiA8.bestand = 1;
    audiA8.preis = 14500;

    autoHinzu.autoHinzufügen(audiA8);

    LearningArray bsp = new LearningArray();


    ArrayList<Integer> zahlen = new ArrayList<Integer>();
    for(int i = 0; i <= 10; i++)
        zahlen.add(i * 7);

    bsp.arrayListAlsParameter(zahlen);
*/

}
