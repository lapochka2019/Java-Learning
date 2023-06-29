package Day4;

import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main (String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ex1: Enter array size");
        //Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно)
        //затем вывести в консольнекоторые статистические данные по массиву
        int n = scan.nextInt();
        Ex1(n);
        System.out.println("Ex2:");
        //Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        //Затем, используя цикл for each вывести в консоль некоторые статистические данные
        Ex2();
        System.out.println("Ex3:");
        //Заполнить двумерный массив 12*8 случайными числами от 0 до 50.
        //В консоль вывести индекс строки, сумма чисел в которой максимальна.
        Ex3(12,8);
        System.out.println("Ex4:");
        Ex4();
    }

    private static void Ex1(int n) {
        Random rand = new Random();
        int [] arr = new int [n];
        int c_8 = 0;
        int c_1=0;
        int c_even=0;
        int c_odd=0;
        int sum = 0;
        for (int a:arr) {
            a = rand.nextInt(10);
            if (a>8) c_8++;
            if (a==1) c_1++;
            if (a%2==0) c_even++;
            if (a%2!=0) c_odd++;
            sum+=a;
            System.out.print(a+", ");
        }
        System.out.println("\nДлина массива: "+n+"\nКоличество чисел больше 8: "+c_8+"\nКоличество чисел равных 1: "+c_1+"\nКоличество четных чисел: "+c_even
                +"\nКоличество нечетных чисел: "+c_odd+"\nСумма всех элементов массива: "+sum);

    }
    private static void Ex2() {
        Random ran = new Random();
        int [] arr = new int[100];
        int max=0;
        int min = 10000;
        int zero = 0;
        int sum_zero=0;
        for (int a:arr) {
            a = ran.nextInt(10000);
            System.out.print(a+", ");
            if (a>max) max=a;
            if (a<min) min = a;
            if(a%10==0){
                zero++;
                sum_zero+=a;
            }

        }
        System.out.println("\nнаибольший элемент массива: " + max + "\nнаименьший элемент массива: " + min +
                "\nколичество элементов массива, оканчивающихся на 0: " + zero + "\nсуммa элементов массива, оканчивающихся на 0: " + sum_zero);
    }

    private static void Ex3(int n, int m) {
        Random ran = new Random();
        int [][] arr = new int [n][m];
        int sum=0, temp=0;
        for (int[] ar:arr) {
            for (int a:ar) {
                a = ran.nextInt(50);
                System.out.print(a+", ");
                temp+=a;
            }
            System.out.println();
            if (temp>sum) sum=temp;
        }
        System.out.println(sum);
    }

    private static void Ex4() {
        int n=100;
        int [] arr = new int[n];
        Random ran = new Random();
        for (int i=0;i<n;i++) {
            arr[i] = ran.nextInt(10000);
            System.out.print(arr[i]+ ", ");
        }
        int sum=0, temp=0, in=0;
        for (int i=1;i<n-1;i++){
            temp=arr[i-1]+arr[i]+arr[i+1];
            if(temp>sum){
                sum=temp;
                in=i-1;
            }

        }
        System.out.println("\nSum " + sum + ", In " + in);

    }


}
