import Players.Fighters.Knight;
import Spells.AttackSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackSpellTest {

    AttackSpell spell;
    Knight knight;

    @Before
    public void before(){
        spell = new AttackSpell("Becometh tiny frogimus", 40 );
        knight= new Knight("Kevin", 50, null);
    }

    @Test
    public void hasIncantation(){
        assertEquals("Becometh tiny frogimus", spell.getIncantation());
    }

    @Test
    public void hasPower(){
        assertEquals(40, spell.getPower());
    }

    @Test
    public void canCauseDamage(){
        spell.cast(knight);
        assertEquals(10, knight.getHp());
    }
}
