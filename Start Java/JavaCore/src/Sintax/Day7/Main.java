package Day7;

import java.util.Random;

public class Main {
    public static void main(String[] arg){
        Random ran = new Random();
        Player p1=new Player(90+ran.nextInt(10));
        Player p2=new Player(90+ran.nextInt(10));
        Player p3=new Player(90+ran.nextInt(10));

        Player.Info();

        Player p4=new Player(90+ran.nextInt(10));
        Player p5=new Player(90+ran.nextInt(10));
        Player p6=new Player(90+ran.nextInt(10));

        Player.Info();

        Player p7=new Player(90+ran.nextInt(10));

        Player.Info();

        Player test=new Player(95);
        for (int i=0;i<96;i++){
            test.Run();
        }
        Player.Info();
    }
}
