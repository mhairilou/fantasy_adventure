package Spells;

import Abilities.IHeal;
import Players.AbstractPlayer;

public class HealingSpell extends AbstractSpell implements IHeal {


    public HealingSpell(String incantation, int power) {
        super(incantation, power);
    }

    @Override
    public void heal(AbstractPlayer player) {
        player.setHp(player.getHp() + this.power);
    }
}
