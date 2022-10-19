package Players.Mages;

import Players.AbstractPlayer;
import Spells.AbstractSpell;

public class Wizard extends AbstractMage{

    private String pet;

    public Wizard(String name, int hp, AbstractSpell currentSpell, String pet) {
        super(name, hp, currentSpell);
        this.pet = pet;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public void castSpellOn(AbstractPlayer player){
        this.getCurrentSpell().use(player);
    }
}
