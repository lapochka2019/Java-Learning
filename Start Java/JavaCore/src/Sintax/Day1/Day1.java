package Day1;

public class Day1 {
    public static void main (String args[]){
        Ex1();//вывести слово Java на экран 10 раз
        System.out.println();
        Ex2();//повторить задание 1, используя цикл for
        System.out.println();
        Ex3();// вывести слово в столбик
        System.out.println();
        Ex4();// выводить текст, пока не будет достигнут предел значения
        System.out.println();
        Ex5();// выполнить задание 4, используя цикл for
        System.out.println();
        Ex6();// составить таблицу умножения для одной цифры
    }
    public static void Ex1(){
        int i=0;
        while (i!=10){
            System.out.print("Java ");
            i++;
        }
    }
    public static void Ex2(){
        for (int i=0;i<10;i++){
            System.out.print("Java ");
        }
    }
    public static void Ex3(){
        for (int i=0;i<10;i++){
            System.out.println("Java ");
        }
    }
    public static void Ex4(){
        int year = 1980;
        while (year<=2020){
            System.out.println("Олимпиада "+year+" года");
            year+=4;
        }
    }
    public static void Ex5(){
        for (int i=1980;i<=2020;i+=4){
            System.out.println("Олимпиада "+i+" года");
        }
    }
    public static void Ex6(){
        for (int i=1;i<10;i++){
            System.out.println(i + " * " + 5 + " = " + i*5);
        }
    }
}
