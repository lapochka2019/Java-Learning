package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Day16 {
    public static void main (String[] arg){

        System.out.println(Ex1());
        Ex2();

    }
    public static String Ex1 (){
        File file = new File("C:\\Users\\lapte\\Simple Java\\src\\Day14\\file1.txt");
        Scanner sc = null;
        float f=0;
        int c =0;

        try {
            sc = new Scanner(file);

        } catch (FileNotFoundException e) {
            System.out.println("File not be found");
        }
        while (sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            c=str.length;
            for (int i=0;i<c;i++){
                f+=(float) Integer.parseInt(str[i]);
            }
        }
        f=f/c;
        String res = f + "--->" + new DecimalFormat("#0.000").format(f).replace(',', '.');
        return res;
    }

    public static void Ex2(){
        File file1 = new File("C:\\Users\\lapte\\Simple Java\\src\\file1.txt");
        File file2 = new File("C:\\Users\\lapte\\Simple Java\\src\\file2.txt");
        PrintWriter pw1 = null;
        PrintWriter pw2= null;
        Scanner sc1 = null;
        Scanner sc2 = null;
        String full="";


        /**Создаем каждый файл**/
        try{
             file1.createNewFile();
         }catch (Exception ex){//файл1
             System.out.println("File1 was not created");
         }
        try{
            file2.createNewFile();
        }catch (Exception ex){//файл2
            System.out.println("File2 was not created");
        }

        /** Открываем файл1 и заполняем его 1000 рандомных чисел от 0 до 100**/
        try {
            pw1 = new PrintWriter(file1);
        } catch (FileNotFoundException e) {//открываем писатель для файла1
            System.out.println("File1 is not found");
        }
        for (int i=0;i<1000;i++){
            int r = new Random().nextInt(101);
            try{
                pw1.print(String.valueOf(r)+" ");
            }catch (Exception ex) {
                System.out.println("The number is not write");
                break;
            }
        }//заполняем файл1 числами
        pw1.close();

        /**Считываем из файла1 по 20 числе и среднее значение записываем в файл2**/

        try{
            sc1 = new Scanner(file1);
        }catch (FileNotFoundException e) {//открываем ридер дял файла1
            System.out.println("File1 is not found");
        }
        try {
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException e) {//открываем писатель для файла2
            System.out.println("File2 is not found");
        }
        while (sc1.hasNextLine()){//считываем одну строку из файла1
            full = sc1.nextLine();
            String[] arr = full.split(" ");//делим строку на числа
            for (int i=0;i<(arr.length);i+=20){//берем двадцатки
                float f=0;
                for (int j=i;j<i+20;j++){
                    f+=Float.parseFloat(arr[j]);//складываем
                }
                f=f/20f;//поулчаем среднее орифметическое
                try{//открываем писатель для файла2
                    pw2.print(new DecimalFormat("#0.00").format(f).replace(',', '.')+" ");//форматируем среднее орифметичческое
                }catch (Exception ex) {
                    System.out.println("The number is not write");
                }
            }
        }
        sc1.close();
        pw2.close();


        /**Считываем из файла2 значения и выводим среднее орифметическое ЦЕЛОЕ**/
        String f2="";
        try {
            sc2 = new Scanner(file2);
        }catch (FileNotFoundException e){//открываем ридер дял файла2
            System.out.println("File2 is not found");
        }
        while (sc2.hasNextLine()){
            f2=sc2.nextLine();
        }
        String[] f2_arr = f2.split(" ");
        double d = 0;
        for (int i=0;i<f2_arr.length;i++){
            d+=Double.parseDouble(f2_arr[i]);
        }
        System.out.printf(String.valueOf((int)d));
        sc2.close();

    }
}
