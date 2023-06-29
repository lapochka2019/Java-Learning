package Day11_Task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPaid;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        salary=0;
        isPaid=false;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPaid=" + isPaid +
                //", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders()>=10000&&isPaid==false) {
            salary += 70000;
            System.out.println("Bonus");
            isPaid=true;
        }
        else if (warehouse.getCountPickedOrders()<10000&&isPaid==false) System.out.println("Бонус пока не доступен");
        else System.out.println("Бонус уже был выплачен");
    }
}
