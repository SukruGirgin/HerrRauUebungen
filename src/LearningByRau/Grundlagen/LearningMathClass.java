package LearningByRau.Grundlagen;

public class LearningMathClass {

    public void mathBsp(){
        double wert1 = 5.3, wert2 = 3.0, wert3 = 0.4, ergebnis;
        ergebnis = wert1 + wert2;
        ergebnis = wert1 - wert3;
        ergebnis = wert1 / wert2;
        ergebnis = wert1 * wert2;

        System.out.println(Math.ceil(15.3)); // output: 16
        System.out.println(Math.floor(15.3)); // output: 15
        System.out.println(Math.abs(-15.3)); // output: 15,3 Absoluter wert: also statt minus wird plus
        System.out.println(Math.max(15.0, 26.3)); // output: 26,3
        System.out.println(Math.pow(10, 3)); // output: 1000.0 - weil: 10 hoch 3, 10*10*10
        System.out.println(Math.sqrt(4)); // output: 2.0 - wurzel aus 4
        System.out.println(Math.PI); // output: 3.14[...]793 - PI
    }

    public void moduloBsp(){
        int wert1 = 3, wert2 = 5;
        int ergebnisInt;
        ergebnisInt = wert2 % wert1; // output: 2 - frage: wie oft passt die 3 in die fünf?
                                                   //      1 mal und der gibt dann den rest wieder, also 2.
        System.out.println(ergebnisInt);

    }


}
