package Players.Fighters;

import Abilities.ICauseDamage;
import Abilities.ITakeDamage;
import Weapons.AbstractWeapon;

public class Knight extends AbstractFighter {


    public Knight(String name, int hp, AbstractWeapon currentWeapon){
        super(name, hp, currentWeapon);
    }

    public String sayNi(){
        System.out.println("Ni!");
        return "Ni!";
    }

    public String useWeapon(ITakeDamage opponent){
        this.getCurrentWeapon().causeDamage(opponent);
        return "WAACHAAA!";
    }

    @Override
    public void takeDamage(int amount) {
        int hpAfterDamage = this.getHp() - amount;
        if(hpAfterDamage < 0){ hpAfterDamage = 0;}
        this.setHp(hpAfterDamage);
    }
}
