package Day6;

import java.util.Random;

public class Teacher {
    String Name;
    String School;

    public Teacher(String name, String school) {
        Name = name;
        School = school;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }
    public void Evolute (Student stud){
        Random ran = new Random();
        int n = 2+ran.nextInt(3);
        System.out.println("Преподаватель " + Name+ " оценил студента с именем " + stud.getName() + " по предмету " + School + " на оценку " + n);
    }
}