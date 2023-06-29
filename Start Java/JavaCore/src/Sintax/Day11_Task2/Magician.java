package Day11_Task2;

public class Magician extends  Hero implements MagicAttack{

    private int magicAtt;

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double att = magicAtt*(1-hero.magicDef);
        if (hero.health-att<0) hero.health=0;
        else hero.health-=att;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
