package Players;

import Abilities.ITakeDamage;

public abstract class AbstractPlayer implements ITakeDamage {

    private String name;
    private int hp;

    public AbstractPlayer(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){ return this.name; }
    public int getHp(){ return this.hp; }
    public void setHp(int newHp){ this.hp = newHp; }

    public void takeDamage(int amount) {
        int hpAfterDamage = this.getHp() - amount;
        if(hpAfterDamage < 0){ hpAfterDamage = 0;}
        this.setHp(hpAfterDamage);
    }
}
