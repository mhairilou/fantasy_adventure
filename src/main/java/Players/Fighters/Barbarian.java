package Players.Fighters;

import Weapons.AbstractWeapon;

public class Barbarian extends AbstractFighter{


    public Barbarian(String name, int hp, AbstractWeapon currentWeapon){
        super(name, hp, currentWeapon);
    }


    @Override
    public void takeDamage(int amount) {

    }
}
