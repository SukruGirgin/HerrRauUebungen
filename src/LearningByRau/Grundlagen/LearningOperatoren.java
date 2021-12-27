package LearningByRau.Grundlagen;

public class LearningOperatoren {

    public void übung1() {

        int wert1 = 30, wert2 = 12;
        double erg;
        // Arithmetische Operatoren
        //+, -, *, /, %
        erg = wert1 % wert2;

        // Inkrement und dekrement-Operator
        // ++, --
        ++wert1;
        wert1++;
        wert1 = 30;

        erg = wert1++ * wert2;
        System.out.println("das Ergebnis ist: " + erg);
        System.out.println("wert1: " + wert1);

        erg = ++wert1 * wert2;
        System.out.println("das Ergebnis ist: " + erg);
        System.out.println("wert1: " + wert1);

        // relattionen operatoren (vergleichsoperatoren)
        // <, <=; >; >=; ==; !=
        Boolean ok = wert1 != wert2;

        System.out.println("ok: " + ok);

        //logische Operatoren
        //&& (& und), || (| oder), ^ (exclusive oder XOR), !(not)

        ok = wert1 < 31 ^ wert2 < 100;
        System.out.println("wert1 < 31 ^ wert2 < 100: " + ok);

        // =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=

        erg += 5; //erg = erg + 5;

        erg *= 5 + 6; // erg = erg * (5 + 6) und nicht erg = erg * 5 + 6
    }

}
