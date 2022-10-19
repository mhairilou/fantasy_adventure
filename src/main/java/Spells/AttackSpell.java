package Spells;

import Abilities.ICauseDamage;
import Abilities.ITakeDamage;
import Players.AbstractPlayer;

public class AttackSpell extends AbstractSpell implements ICauseDamage {

    public AttackSpell(String incantation, int power) {
        super(incantation, power);
    }



    @Override
    public void causeDamage(ITakeDamage opponent) {
        opponent.takeDamage(power);
    }

    @Override
    public void cast(AbstractPlayer player) {
        this.causeDamage(player);
    }
}
