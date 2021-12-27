package LearningByRau.ArbeitenMitDateien;

public class LearningDateiAuslesen {
    /*
        public static void main(String[] args) throws FileNotFoundException {

        Scanner vonDatei = new Scanner(new FileReader("zahlen.txt"));
        int zahl;
        int i= 1;

        try {
            while (vonDatei.hasNextLine()) {
                zahl = Integer.parseInt(vonDatei.nextLine());
                System.out.println(i + ". Zahl ist: " + zahl);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen der Datei!");
        }
        vonDatei.close();

        Scanner vonDatei = new Scanner(new FileReader("zahlen.txt"));
        int zahl;
        int[] dateiArr = {1, 2, 3};

        try {
            while (vonDatei.hasNextLine()) {
                int i = 0;
                dateiArr[i] = Integer.parseInt(vonDatei.nextLine());
                i++;
            }
            for (int i = 0; 0 < dateiArr.length; i++) {
                System.out.println("[" + dateiArr[i] + "] ");
            }
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen der Datei!");
        }
        vonDatei.close();
    }
     */
}
