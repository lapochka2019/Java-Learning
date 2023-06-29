package Day6;


public class Main {
public static void main(String [] arg) {
    Airplane airplane1 = new Airplane("Manuf", 2000, 8, 1000);
    airplane1.info();
    airplane1.fillUp(50);
    airplane1.info();
    System.out.println("***");
    Student student = new Student("Mark");
    Teacher teacher = new Teacher("Ira","English");
    teacher.Evolute(student);
    teacher.Evolute(student);
    teacher.Evolute(student);

    Airplane test1 = new Airplane("First", 1000, 10, 10000);
    Airplane test2 = new Airplane("Second", 2000, 20, 200000);
    System.out.println("***");
    Airplane.compareAirplanes(test1,test2);
    Airplane.compareAirplanes(test2,test1);
    System.out.println(airplane1);
    }
}
