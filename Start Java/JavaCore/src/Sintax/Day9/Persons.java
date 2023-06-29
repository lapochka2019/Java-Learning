package Day9;

public class Persons {
    public static void main (String [] arg){
    Human person = new Human("Bob");
    person.printInfo();
    Student student = new Student("Ellen", "BVT1903");
    student.printInfo();
    Teacher teacher = new Teacher("Nikol", "Math");
    teacher.printInfo();
    }
    public static class Human{
        private String Name;
        public Human (String Name){
            this.Name=Name;
        }

        public String getName() {
            return Name;
        }

        public void printInfo(){
            System.out.println("Этот человек с именем " + Name);
        }
    }
    public static class Student extends Human{
        private String Group;
        public Student(String Name, String Group) {
            super(Name);
            this.Group=Group;
        }

        public String getGroup() {
            return Group;
        }

        public void printInfo(){
            super.printInfo();
            System.out.println("Этот студент с именем " + getName());
        }
    }
    public static class Teacher extends Human{
        private String Subject;

        public Teacher(String Name, String subject) {
            super(Name);
            Subject = subject;
        }

        public String getSubject() {
            return Subject;
        }
        public void printInfo(){
            super.printInfo();
            System.out.println("Этот преподаватель с именем " + getName());
        }
    }
}