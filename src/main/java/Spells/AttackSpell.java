package Spells;

import Players.AbstractPlayer;

public class AttackSpell extends AbstractSpell{

    public AttackSpell(String incantation, int power) {
        super(incantation, power);
    }

    @Override
    public void use(AbstractPlayer player) {

    }
}
