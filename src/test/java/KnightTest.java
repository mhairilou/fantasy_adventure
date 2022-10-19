import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Knight knight2;
    Sword sword;
    Sword sword2;

    @Before
    public void before(){
        sword = new Sword(30);
        sword2 = new Sword(40);
        knight = new Knight("Arthur", 100, sword);
        knight2 = new Knight("Day", 120, sword2);
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

    @Test
    public void exclaimsWhenAttacking(){
        assertEquals("WAACHAAA!", knight.useWeapon());
    }

    @Test
    public void canTakeDamage(){
        knight.takeDamage(30);
        assertEquals(70, knight.getHp());
    }

    @Test
    public void attackingDealsDamage(){
        knight.useWeapon()
    }




}
