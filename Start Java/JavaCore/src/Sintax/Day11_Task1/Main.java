package Day11_Task1;

public class Main {
    public static void main (String[] arg){
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Picker picker2 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(warehouse2);
        Courier courier = new Courier(warehouse2);

        System.out.println("test work for two pickers");
        System.out.println("before work");
        picker1.bonus();
        picker2.bonus();
        System.out.println("after work");
        businessProcess(picker1,5000);
        businessProcess(picker2,5000);
        picker1.bonus();
        picker2.bonus();
        System.out.println("after bonus");
        picker1.bonus();
        picker2.bonus();

        System.out.println("test work for two other couriers");
        System.out.println("before work");
        courier1.bonus();
        courier.bonus();
        System.out.println("after work");
        businessProcess(courier1,5000);
        businessProcess(courier,5000);
        courier1.bonus();
        courier.bonus();
        System.out.println("after bonus");
        courier1.bonus();
        courier.bonus();
    }
    static void businessProcess(Worker worker, int n){
        //worker.bonus();
        for (int i=0;i<n;i++){
            worker.doWork();
        }
        //worker.bonus();
        //worker.bonus();
    }

}
