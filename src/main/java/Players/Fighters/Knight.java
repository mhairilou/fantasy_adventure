package Players.Fighters;

import Weapons.AbstractWeapon;

public class Knight extends AbstractFighter {


    public Knight(String name, int hp, AbstractWeapon currentWeapon){
        super(name, hp, currentWeapon);
    }

    public String sayNi(){
        System.out.println("Ni!");
        return "Ni!";
    }

    public String useWeapon(){
        this.getCurrentWeapon().causeDamage();
        return "WAACHAAA!";
    }

    @Override
    public void takeDamage(int amount) {
        int hpAfterDamage = this.getHp() - amount;
        this.setHp(hpAfterDamage);
    }
}
