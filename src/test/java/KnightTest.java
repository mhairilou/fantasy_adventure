import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Sword sword2;

    @Before
    public void before(){
        sword = new Sword(30);
        sword2 = new Sword(40);
        knight = new Knight("Arthur", 100, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Arthur", knight.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, knight.getHp());
    }

    @Test
    public void hasCurrentWeapon(){
        assertEquals(30, knight.getCurrentWeapon().getPower());
    }

    @Test
    public void canSetWeapon(){
        knight.setCurrentWeapon(sword2);
        assertEquals(40, knight.getCurrentWeapon().getPower());
    }

    @Test
    public void canSayNi(){
        String result = knight.sayNi();
        assertEquals("Ni!", result);
    }





}
