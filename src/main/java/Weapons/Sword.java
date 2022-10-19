package Weapons;

import Abilities.ICauseDamage;
import Abilities.ITakeDamage;

public class Sword extends AbstractWeapon {

    int sharpness;
    public Sword(int power, int sharpness){
        super(power);
        this.sharpness = sharpness;
    }

    @Override
    public void causeDamage(ITakeDamage opponent) {
        int damage = this.power * (this.sharpness /100);
        opponent.takeDamage(damage);
    }


}
