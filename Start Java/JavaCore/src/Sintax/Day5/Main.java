package Day5;

import Day6.Airplane;

public class Main {
public static void main(String [] arg) {
    Car car = new Car();
    car.setColor("Blue");
    car.setModel("Renault");
    car.setYear(2012);
    Motorbike bike = new Motorbike("Cool", "Black",2022);
    System.out.println(car.yearDifference(2022));
    System.out.println(bike.yearDifference(2020));
    }
}
