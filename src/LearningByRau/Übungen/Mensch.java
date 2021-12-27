package LearningByRau.Übungen;

public class Mensch {

    public int groeßeInCM;
    public int alter;
    public String ethnie;
    public String deen;
    public String augenfarbe;
    public String name;
    public String geschlecht;

    public String arbeiten(String geschlecht) {
        if (geschlecht == "Mann") {
            return "Geh Arbeiten!";
        } else {
            return "Geh Hartzen!";
        }

    }

}
