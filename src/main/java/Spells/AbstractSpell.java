package Spells;

public class AbstractSpell {

    String incantation;
    int power;

    public AbstractSpell(String incantation, int power){
        this.incantation = incantation;
        this.power = power;
    }

    public String getIncantation() {
        return incantation;
    }

    public int getPower() {
        return power;
    }
}
