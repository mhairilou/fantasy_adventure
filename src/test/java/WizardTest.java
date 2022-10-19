import Players.AbstractPlayer;
import Players.Healers.Unicorn;
import Players.Mages.Wizard;
import Spells.AbstractSpell;
import Spells.AttackSpell;
import Spells.HealingSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    HealingSpell spell;

    AttackSpell spell2;
    Unicorn unicorn;

    @Before
    public void before(){
        spell = new HealingSpell("LALALALA", 2);
        spell2 = new AttackSpell("Blowupus maximus", 500);
        wizard = new Wizard("Harry", 20, spell, "Hedwig");
        unicorn = new Unicorn("Betty", 10, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(20, wizard.getHp());
    }

    @Test
    public void hasSpell(){
        assertEquals("LALALALA", wizard.getCurrentSpell().getIncantation());
    }

    @Test
    public void canUseSpell(){
        wizard.castSpellOn(unicorn);
        assertEquals(12, unicorn.getHp());
    }

    @Test
    public void canChangeSpell(){
        wizard.setCurrentSpell(spell2);
        assertEquals("Blowupus maximus", wizard.getCurrentSpell().getIncantation());
    }
    
}
