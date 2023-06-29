package Day6;

public class Airplane {
    String Manufacture;
    private int Year;
    private int Length;
    private int Weight;
    private int Fuel=0;

    Airplane(String Manufacture,int Year, int Length, int Weight){
        this.Manufacture = Manufacture;
        this.Year = Year;
        this.Length = Length;
        this.Weight = Weight;
    }
    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public void setFuel(int Fuel) {
        this.Fuel = Fuel;
    }

    public int getFuel() {
        return Fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + Manufacture + ", год выпуска: " + Year + ", длина: " + Length + ", вес: " + Weight
                + ", количество топлива в баке: " + Fuel);
    }
    public void fillUp(int n){
        setFuel(Fuel+n);
    }
    public int getLength() {
        return Length;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength()>airplane2.getLength()){
            System.out.println("Первый самолет больше");
        }else if (airplane2.getLength()>airplane1.getLength()){
            System.out.println("Второй самолет больше");
        }else {
            System.out.println("Они равны");
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "Manufacture='" + Manufacture + '\'' +
                ", Year=" + Year +
                ", Length=" + Length +
                ", Weight=" + Weight +
                ", Fuel=" + Fuel +
                '}';
    }
}
