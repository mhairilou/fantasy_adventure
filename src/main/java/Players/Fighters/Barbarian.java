package Players.Fighters;

import Abilities.ITakeDamage;
import Weapons.AbstractWeapon;

public class Barbarian extends AbstractFighter{


    public Barbarian(String name, int hp, AbstractWeapon currentWeapon){
        super(name, hp, currentWeapon);
    }


    public String useWeapon(ITakeDamage opponent){
        this.getCurrentWeapon().causeDamage(opponent);
        int reboundDamage = getCurrentWeapon().getPower() / 2;
        this.takeDamage(reboundDamage);
        return "AAAAGHGHG!";
    }
}
