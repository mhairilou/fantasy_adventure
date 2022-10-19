package Players.Mages;

import Players.AbstractPlayer;
import Spells.AbstractSpell;


public abstract class AbstractMage extends AbstractPlayer {


    public AbstractMage(String name, int hp, AbstractSpell currentSpell) {
        super(name, hp);
    }
}
