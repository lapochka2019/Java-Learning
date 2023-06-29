package Day11_Task2;

public abstract class Hero implements PhysAttack{
    int health;//здоровье
    double physDef;//процент физического урона
    double magicDef;//процент магического урона
    int physAtt;//количество наночимиого физического урона

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {//расчет урона наносимого hero
        double att = physAtt*(1-hero.physDef);
        if (hero.health-att<0) hero.health=0;
        else hero.health-=att;
    }
}
