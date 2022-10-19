import Players.Fighters.Barbarian;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;

    @Before
    public void before(){
        club = new Club(40);
        barbarian = new Barbarian("Woody", 300, club);
    }

    @Test
    public void hasName(){
        assertEquals("Woody", barbarian.getName());
    }

}
