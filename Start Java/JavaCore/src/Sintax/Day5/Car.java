package Day5;

public class Car {
    static String Model;
    static String Color;
    static int Year;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
    public void info (){
        System.out.println("This is a car");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - Year);
    }
}
