package Weapons;

import Abilities.ICauseDamage;
import Abilities.ITakeDamage;

public class Sword extends AbstractWeapon {


    public Sword(int power){
        super(power);
    }

    @Override
    public void causeDamage(ITakeDamage opponent) {
        opponent.takeDamage(this.power);
    }


}
