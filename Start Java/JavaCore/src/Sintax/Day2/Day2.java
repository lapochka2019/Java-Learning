package Day2;

import java.util.Scanner;

public class Day2 {
    public static void main(String ard[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ex1: enter the number");
        int input = scan.nextInt();
        Ex1(input);//определить к какому типу оносится введеное здание
        System.out.println("Ex2: enter the 'a' and the 'b'");
        int a = scan.nextInt();
        int b = scan.nextInt();
        Ex2(a,b);//используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка
        System.out.println("Ex3:");
        Ex3(a,b);//реализовать программу №2, используя цикл while.
        System.out.println("Ex4: enter the number");
        double x = scan.nextDouble();
        System.out.println(Ex4(x));//рализовать программу, вычисляющую значение у по формуле
    }
    public static void Ex1(int n){
        if (n<0){
            System.out.println("Ошибка ввода!");
        }else if (n>0&&n<5){
            System.out.println("Малоэтажный дом");
        }else if (n>4&&n<9){
            System.out.println("Среднеэтажный дом");
        }else System.out.println("Многоэтажный дом");
    }
    public static void Ex2 (int a,int b){
        if (a>=b) System.out.println("Некорректный ввод!");
        for (int i=a+1; i<b;i++){
            if(i%5==0 && i%10!=0) System.out.println(i);
        }
    }
    public static void Ex3 (int a,int b){
        if (a>=b) System.out.println("Некорректный ввод!");
        while(a<b){
            if(a%5==0 && a%10!=0) System.out.println(a);
            a++;
        }
    }
    public static double Ex4(double x){
        if(x>=5){
            return (x*x-10)/(x+7);
        }else if (x>-3&&x<5){
            return (x+3)*(x*x-2);
        }else return 420;
    }

}
