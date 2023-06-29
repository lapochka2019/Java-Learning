package Day7;

public class Player {
    private final static int MAX = 100;
    private final static int MIN = 0;
    static int CountPlayers=0;

    private int Stamina;

    public Player(int Stamina) {
        this.Stamina = Stamina;
        if (CountPlayers<7)CountPlayers++;
    }

    public int getStamina() {
        return Stamina;
    }

    public int getCountPlayers() {
        return CountPlayers;
    }
    public void Run(){
        if (Stamina>MIN) Stamina--;
        if (Stamina==MIN) CountPlayers--;
    }
    public static void Info(){
        if (CountPlayers<6) System.out.println("Команды неполные. " +
                "На поле еще есть " + (6-CountPlayers) + " свободных мест");
        else System.out.println(" На поле нет свободных мест");
    }
}
