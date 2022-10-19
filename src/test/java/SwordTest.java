import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(15);
    }

    @Test
    public void hasPower(){
        assertEquals(15, sword.getPower());
    }
}
