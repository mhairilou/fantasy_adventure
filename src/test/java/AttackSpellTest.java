import Spells.AttackSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackSpellTest {

    AttackSpell spell;

    @Before
    public void before(){
        spell = new AttackSpell("Becometh tiny frogimus", 40 );
    }

    @Test
    public void hasIncantation(){
        assertEquals("Becometh tiny frogimus", spell.getIncantation());
    }

    @Test
    public void hasPower(){
        assertEquals(40, spell.getPower());
    }
}
