package LearningByRau.ArbeitenMitDateien;

public class LearningTryCatch {

    public void tryCatch() {
        int[] numbers = {3, 6, 9};
        try {
            System.out.println(numbers[10]); // Wirft eine ArrayIndex Ecpetion
                                             // weil es kein 10. Element im Array gibt.
        } catch (Exception e) {
            //Anstatt den Fehler anzuzeigen sagen wir dem Nutzer lieber was schieflief
            // und lassen das Programm weiter laufen.
            System.out.println("Something went wrong. Max. Array Index: " + "[" + (numbers.length - 1) + "]");
            System.out.println("Exception code " + e);
        }
    }

    static void getAcces (int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - you are too young");
        }
    }

    /*
        Try and Catch vor allem bei Externen Dateien wichtig. Vor allem, wenn die Informationen die man erhält nicht
        sicher sind oder wenn man etwas versucht was nicht sicher funktionieren wird.

        Bsp.:
        import java.util.Scanner;
        public static void main(String[] args) {

            int zahl1, zahl2, zahl3;
            Scanner eingabe = new Scanner(System.in);
            System.out.print("Gib bitte eine Zahl ein: ");
            try {
                zahl1 = eingabe.nextInt();
                System.out.print("Gib bitte eine Zahl ein: ");
                zahl2 = eingabe.nextInt();
                zahl3 = zahl1 / zahl2;
                System.out.print("Ergebnis: " + zahl3);
            } catch (InputMismatchException inputE) {
                System.out.println("Falsche eingabe, nur Ganze Zahlen eingeben: " + inputE.toString());
            } catch (ArithmeticException aException) {
                System.out.println("Durch 0 teilen Verboten: " +  aException.toString());
            } catch (Exception e) {
                System.out.println("Generischer Fehler aufgetreten: " + e.toString());
            }
        }
     */

}
