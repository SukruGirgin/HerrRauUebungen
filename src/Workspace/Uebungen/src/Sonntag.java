package Workspace.Uebungen.src;

public class Sonntag {
    public static int monthDays(int monthNumber) {
        return switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 29;
            case 4, 6, 9,11 -> 30;
            default -> throw new IllegalStateException("Unexpected value: " + monthNumber);
        };
    }
    
    public static int lastWeekDay = 2;  // 2019
    public static int totalSundays = 0;
    public static void getAllSundays() {
        for (int i = 12; i > 0; i-- ) {
            int zahlOfDays = monthDays(i);
            zahlOfDays -= lastWeekDay + 1;
            if (zahlOfDays % 7 == 0) {
            	System.out.println("In Monat "+ i + " is Sonntag die erste Tag");
                totalSundays++;
                lastWeekDay = 6;
            } else {
                if (zahlOfDays <= 28) {
                    lastWeekDay = 28 - zahlOfDays - 1;
                } else {
                    lastWeekDay = 35 - zahlOfDays - 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        getAllSundays();
        System.out.println(totalSundays);
    }
}


