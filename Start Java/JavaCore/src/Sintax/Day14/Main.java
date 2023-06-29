package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        File file = new File("C:\\Users\\lapte\\Simple Java\\src\\Day14\\file1.txt");
        printSumDigits(file);
        System.out.println(parseFileToStringList(new File("C:\\Users\\lapte\\Simple Java\\src\\Day14\\people")));
        System.out.println(parseFileToObjList(new File("C:\\Users\\lapte\\Simple Java\\src\\Day14\\people")));
    }
    public static void printSumDigits(File file){
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scan.nextLine();
        String[] arr = line.split(" ");
        if (arr.length!=10) System.out.println("Некорректный входной файл");
        else {
            int c=0;
            for (int i=0;i<10;i++){
                c+=Integer.parseInt(arr[i]);
            }
            System.out.println(c);
        }
        scan.close();
    }
    public static List<String> parseFileToStringList(File file){
        List<String> list = new ArrayList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (scan.hasNext()){
            String line = scan.nextLine();
            String[] test = line.split(" ");
            if (Integer.parseInt(test[1])<0) {
                try {
                    throw new Exception();
                } catch (Exception exception) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
            list.add(line);
        }

        scan.close();
        return list;
    }

    public static class Person{
        String name;
        int age;
        Person (String name, int age){
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> list = new ArrayList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (scan.hasNext()){
            String line = scan.nextLine();
            String[] test = line.split(" ");
            if (Integer.parseInt(test[1])<0) {
                try {
                    throw new Exception();
                } catch (Exception exception) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
            list.add(new Person(test[0],Integer.parseInt(test[1])));
        }

        scan.close();
        return list;
    }
}
