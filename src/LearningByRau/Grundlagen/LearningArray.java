package LearningByRau.Grundlagen;

import java.util.*;

public class LearningArray {

    public void nameAbfragen(){
        ArrayList<String> namenArr = new ArrayList<String>();



    }

    public void hashMap(){
        /*
            HashMap kann wie Array mehrere Elemente halten.
            Element bei HashMap besteht immer aus Key & Value (key-value pair).
         */

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Deutschland", "Berlin"); // .put um Element hinzuzufügen.
        capitalCities.put("Türkei", "Ankara"); //Key(Schlüssel) ist Türkei, value(wert) ist Ankara.
        capitalCities.put("England", "London");
        System.out.println(capitalCities.get("Türkei")); // oder
        String valueGermany = capitalCities.get("Deutschland");
        System.out.println(valueGermany);
        capitalCities.remove("England"); // remove, für einzelnes Element, clear() für alle Elemente

    }

    public void arrayListUdemyHerausforderung(){

        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        Random rnd = new Random(System.currentTimeMillis());

        for(int i = 0; i < 100; i++)
            zahlen.add(rnd.nextInt(100));

        if (zahlen.contains(5))
            System.out.println("5 ist vorhanden!");
        else
            System.out.println("Die 5 ist nicht vorhanden!");

        Collections.sort(zahlen);
        System.out.println(zahlen);
    }

    public void arrayListenSortieren() {

        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        Random rnd = new Random(System.currentTimeMillis());

        for(int i = 0; i < 10; i++) {
            zahlen.add(rnd.nextInt(100));
        }
        System.out.println(zahlen);
        Collections.sort(zahlen); // Collections klasse und dort sort um den inhalt des Arrays zu sortieren.
        zahlen.remove(7); // remove(index: ) löscht genau diesen index punkt weg.
        System.out.println(zahlen);
    }

    public void arrayListAlsParameter(ArrayList arrayList) { //bezüglich des Parameters ArrayList arrayList, siehe unten

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print("[" + arrayList.get(i) + "] ");
        }
        LearningArray bsp = new LearningArray();
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++)
            zahlen.add(i * 7);

        bsp.arrayListAlsParameter(zahlen);
        // statt array[12] = 72; bei ArrayList, die jeweilige indexstelle, so initialisieren. (index, inhalt)
        zahlen.set(12, 72);


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




    public void arrayListFeatures() {
        //keine verwendung von Primitiven Datentypen

        ArrayList<String> kunde = new ArrayList<String>();
        kunde.add("Sedat"); //Hinzufügen
        kunde.add("Agon");

        String kunde1 = kunde.get(1); //index 1 = Agon.
        System.out.println(kunde.get(0) + " = Sedat");

        kunde.add("Michael"); //Hinzufügen
        kunde.remove("Michael"); //Entfernen

        ArrayList<Double> bestellNr = new ArrayList<Double>(); //Integer, Double etc. nicht auf datentyp zugreifen
        // sondern auf die Klasse des Primitiven Datentyps
        bestellNr.add(20092021.0001); // TagMonatJahr.BestellNrDesTages

        List<Integer> zahlen = new ArrayList<Integer>(); //ist aber Kompliziert und derzeit unnötig
    }

    public void arrayListenBefüllen() {
        ArrayList<Integer> zahlen = new ArrayList<Integer>();

        System.out.println("Es sind folgende Menge an Werten in der ArrayListe: " + zahlen.size());
        zahlen.add(5);
        zahlen.add(7);
        System.out.println("Es sind folgende Menge an Werten in der ArrayListe: " + zahlen.size());
        System.out.println(zahlen.get(1) + zahlen.get(0)); // so arbeitet man mit dem Inhalt
        System.out.println("Ab hier for Schleife: ");
        for(int i = 2; i <= 11; i++) {
            zahlen.add(i);
            System.out.println(zahlen.get(i));
        }
        System.out.println();
        System.out.println("Es sind folgende Menge an Werten in der ArrayListe: " + zahlen.size());

    }

    public void arrayListContains() {
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        Random rnd = new Random(System.currentTimeMillis());

        for(int i = 0; i < 100; i++) {
           zahlen.add(rnd.nextInt(100));
        }
        if (zahlen.contains(25) == true) {
            System.out.println("25 ist enthalten.");
        } else {
            System.out.println("25 ist nicht enthalten."); //wegen for ist manchmal enthalten oder halt nicht
        }
    }

    public void aufArrayListElementeZugreifen(){
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        zahlen.add(25);
        zahlen.add(15);
        zahlen.add(1953);
        zahlen.add(13);
        System.out.println("An Pos 0 befindet sich: " + zahlen.get(2));
        for(int i = 4; i < 15; i++) //bei for mit nur 1 Befehlszeile kann man {} weglassen.
            zahlen.add(i);
        System.out.println("An Pos 7 befindet sich: " + zahlen.get(7));
    }

    public void mehrDimensionaleArrays() {

        /*
            [00][01][02]    [  ][  ][  ]
            [10][11][12]    [  ][  ][ 1]
            [20][21][22]    [  ][  ][  ]
         */

        int[][] zweiDimArr = new int[3][3];
        Random rnd = new Random(System.currentTimeMillis());

        zweiDimArr[1][2] = 1;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                zweiDimArr[i][j] = j; //statt j geht auch rnd.nextInt(5) für zufällige zahlen zwischen 0 und 5
                System.out.print("[" + i + zweiDimArr[i][j] + "] ");
            }
            System.out.println();
        }

        int[][] arr2 = {
                {00, 01, 02},
                {10, 11, 12},
                {20, 21, 22}
        };
        System.out.println("[" + arr2[2][1] + "]");

    }




    public int[] noten;

    public void korrektur(int dieNoten[]) {
        for(int noten : dieNoten) {
            noten += 1;
            System.out.println(noten);
        }

        System.out.println("Ab hier nächste Array Schleife: ");
        for(int i = 0; i < dieNoten.length; i++) {
            dieNoten[i] += 1;
            System.out.println(dieNoten[i]);
        }
    }


    public void zweiDimensionaleArrays() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr[0][1]);
    }

    public void arrayObjekte() {
        LearningIfElse[] bsp = {new LearningIfElse(), new LearningIfElse(), new LearningIfElse()};
        bsp[0].aufgabe6(3, true);
        bsp[2].aufgabe6(2, false);
    }

    public void array1() {

        int[] arrayName;
        arrayName = new int[5];
        arrayName[0] = 65;

        int[] arr2 = new int[12];
        arr2[0] = 17;
        arr2[1] = 22;
        arr2[2] = 21;
        arr2[3] = 12;
        arr2[4] = 13;
        arr2[5] = 31;
        arr2[6] = 325;

        int[] arr3 = {10, 12, 20, 24, 1};

    }

    public void array2() {

        int[] arr = new int[8];

        for (int i = 0; i < 8 ; i++){
            arr[i] = i; //jedes element erhält den Wert i, mit jedem durchgang ist i + 1;
            if(i == 3) {
                System.out.println(arr[i] + ". = " + arr[i]);
            }
        }

    }

    public int array3() {

        int[] arr = new int[8];
        int x = 0;

        for (int i = 0; i < 8 ; i++){
            arr[i] = i;
            if(i == 3) {
                x = arr[i];
            }
        }

        return x + 2;
    }

    public void array4() {
        int[] arr13 = new int[8];

        for (int i = 0; i < 8; i++){
            arr13[i] = i;
            System.out.println(arr13[i] + ". = " + arr13[i]);
        }
    }
}
