package LearningByRau.OOP;

public class LearningSetterGetter extends LearningOOP {

    private int alter;
    private String name;

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAlter(){
        return this.alter;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ausführungFürMain(){
        LearningSetterGetter bsp = new LearningSetterGetter();
        bsp.setAlter(15);
        System.out.println("Alter ist: " + bsp.getAlter());


    }

}
