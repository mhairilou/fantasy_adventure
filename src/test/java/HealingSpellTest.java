import Players.Fighters.Barbarian;
import Spells.HealingSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingSpellTest {

    HealingSpell healingSpell;
    Barbarian barbarian;

    @Before
    public void before(){
        healingSpell = new HealingSpell("Magico feelbetterum!", 10);
        barbarian = new Barbarian("Barbara", 1, null);
    }

    @Test
    public void hasIncantation(){
        assertEquals("Magico feelbetterum!", healingSpell.getIncantation());
    }

    @Test
    public void hasPower(){
        assertEquals(10, healingSpell.getPower());
    }

    @Test
    public void canHeal(){
        healingSpell.heal(barbarian);
        assertEquals(11, barbarian.getHp());
    }
}
