package Weapons;

import Abilities.ITakeDamage;

public class Club extends AbstractWeapon {

    public Club(int power){
        super(power);
    }

    @Override
    public void causeDamage(ITakeDamage opponent) {
        opponent.takeDamage(this.power);
    }
}
