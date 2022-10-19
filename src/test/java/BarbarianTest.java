import Players.Fighters.Barbarian;
import Players.Fighters.Knight;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Knight knight;
    Sword sword;
    Club club;

    @Before
    public void before(){
        club = new Club(40);
        barbarian = new Barbarian("Woody", 300, club);
        sword = new Sword(20, 100);
        knight = new Knight("Cat", 200, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Woody", barbarian.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(300, barbarian.getHp());
    }

    @Test
    public void hasWeapon(){
        assertEquals(40, barbarian.getCurrentWeapon().getPower());
    }

    @Test
    public void canUseWeapon(){
        barbarian.useWeapon(knight);
        assertEquals(160, knight.getHp());
        String barbarianWail = barbarian.useWeapon(knight);
        assertEquals("AAAAGHGHG!", barbarianWail);
    }

    @Test
    public void barbarianIsClumsy(){
        barbarian.useWeapon(knight);
        assertEquals(280, barbarian.getHp());
    }

}
