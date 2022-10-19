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


}
