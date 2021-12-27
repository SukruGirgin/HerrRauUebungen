package LearningByRau.Grundlagen;

import java.util.Date;

public class LearningSystemOutPrint {

    public void printF() {
        Date date = new Date();
/*
        A prints out the full day of the week.
        d formats a two-digit day of the month.
        B is for the full month name.
        m formats a two-digit month.
        Y outputs a year in four digits.
        y outputs the last two digits of the year.
 */
        System.out.printf("%tT%n", date);
        System.out.printf("%1$tA %1$td. %1$tB %1$tY %n", date);

        //https://www.baeldung.com/java-printstream-printf
    }

}
