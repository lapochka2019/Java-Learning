package Day11_Task2;

public class Shaman extends  Hero implements MagicAttack, Healer {

    private int magicAtt;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double att = magicAtt*(1-hero.magicDef);
        if (hero.health-att<0) hero.health=0;
        else hero.health-=att;
    }

    @Override
    public void healHimself() {
        if (health+25>100) health=100;
        else health+=25;
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health+10<100)hero.health=100;
        else hero.health+=10;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
