import Players.Fighters.Knight;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;
    Knight knight;

    @Before
    public void before(){
        club = new Club(30);
        knight = new Knight("Poor wee guy", 40, club);
    }

    @Test
    public void hasPower(){
        assertEquals(30, club.getPower());
    }

    @Test
    public void canCauseDamage(){
        club.causeDamage(knight);
        assertEquals(10, knight.getHp());
    }


}
