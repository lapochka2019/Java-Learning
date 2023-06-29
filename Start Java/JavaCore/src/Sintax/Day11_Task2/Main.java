package Day11_Task2;

public class Main {
    public static void main (String[] arg){
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();
        Paladin paladin = new Paladin();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        paladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        paladin.healHimself();
        System.out.println(paladin.toString());
        for (int i=0;i<5;i++){
            warrior.physicalAttack(magician);
            System.out.println( magician.toString());
        }

    }
}
