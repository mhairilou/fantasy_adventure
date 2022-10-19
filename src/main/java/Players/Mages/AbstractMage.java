package Players.Mages;

import Players.AbstractPlayer;
import Spells.AbstractSpell;


public abstract class AbstractMage extends AbstractPlayer {

    AbstractSpell currentSpell;
    public AbstractMage(String name, int hp, AbstractSpell currentSpell) {
        super(name, hp);
        this.currentSpell = currentSpell;
    }

    public AbstractSpell getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(AbstractSpell currentSpell) {
        this.currentSpell = currentSpell;
    }
}
