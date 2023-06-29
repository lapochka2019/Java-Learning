package Day11_Task2;

public class Warrior extends Hero{

    public Warrior(){
        physDef =0.8;
        magicDef =0;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
