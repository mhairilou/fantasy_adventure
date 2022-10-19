package Players.Fighters;
import Abilities.ITakeDamage;
import Players.AbstractPlayer;
import Weapons.AbstractWeapon;

public abstract class AbstractFighter
        extends AbstractPlayer
        implements ITakeDamage{
    private AbstractWeapon currentWeapon;

    public AbstractFighter(String name, int maxHp, AbstractWeapon currentWeapon){
        super(name, maxHp);
        this.currentWeapon = currentWeapon;
    }

    public AbstractWeapon getCurrentWeapon(){ return this.currentWeapon; }
    public void setCurrentWeapon(AbstractWeapon weapon){ this.currentWeapon = weapon; }

}
