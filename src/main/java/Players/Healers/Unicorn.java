package Players.Healers;

import Abilities.IHeal;
import Players.AbstractPlayer;

public class Unicorn extends AbstractPlayer implements IHeal {

    private int healingPower;
    public Unicorn(String name, int hp, int healingPower) {
        super(name, hp);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    @Override
    public void heal(AbstractPlayer player) {
        player.setHp(player.getHp() + this.healingPower);
    }


    }

