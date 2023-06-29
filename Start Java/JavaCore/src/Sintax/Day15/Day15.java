package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day15 {
    public static void main (String[] arg) throws FileNotFoundException {
        File file = new File("C:\\Users\\lapte\\Simple Java\\src\\Day15\\shoes.csv");
        File output = new File("C:\\Users\\lapte\\Simple Java\\src\\Day15\\newfile.txt");
        PrintWriter pw = new PrintWriter(output);
        List <Table> list = new ArrayList<>();
        Scanner scan = null;
        try{
            scan = new Scanner(file);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Файл не найден!");
        }
        while (scan.hasNextLine()){
            String[] str = scan.nextLine().split(";");
            try{
                Table t = new Table(str[0],Integer.parseInt(str[1]),Integer.parseInt(str[2]));
                if (t.getCount()==0) list.add(t);
            }catch (Exception ex){
                System.out.println("Неверный формат данных");
                break;
            }
        }
        while (!list.isEmpty()){
            try {
                pw.println(list.get(0).toString());
            }catch (Exception ex){
                System.out.println("Не удалось записать файл");
                break;
            }
            list.remove(0);
        }
        scan.close();
        pw.close();
    }
    static class Table{
        private String name;
        private int size;
        private int count;

        public Table(String name, int size, int count) {
            this.name = name;
            this.size = size;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return name + ", " + size + ", " + count;
        }
    }
}
