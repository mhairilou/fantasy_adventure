package Weapons;

import Abilities.ICauseDamage;

public abstract class AbstractWeapon implements ICauseDamage {

    int power;
    public AbstractWeapon(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
