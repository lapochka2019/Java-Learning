package Day5;

public class Motorbike {
    static String Model;
    static String Color;
    static int Year;

    public Motorbike(String Model, String Color, int Year) {
        this.Model = Model;
        this.Color = Color;
        this.Year = Year;
    }
    public void info (){
        System.out.println("This is a motorbike");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - Year);
    }

}
