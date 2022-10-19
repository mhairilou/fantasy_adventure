import Players.Fighters.Knight;
import Players.Healers.Unicorn;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicornTest {

    Unicorn unicorn;
    Knight knight;
    Sword sword;

    @Before
    public void before(){
        unicorn = new Unicorn("Talulah", 500, 20);
        sword = new Sword(20, 100);
        knight = new Knight("Injured soul", 40, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Talulah", unicorn.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(500, unicorn.getHp());
    }
    
    @Test
    public void hasHealingPower(){
        assertEquals(20, unicorn.getHealingPower());
    }

    @Test
    public void canHeal(){
        unicorn.heal(knight);
        assertEquals(60, knight.getHp());
    }
}
