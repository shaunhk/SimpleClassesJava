import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {waterbottle = new WaterBottle(100);}

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void cantDrinkPast0(){
        waterbottle.empty();
        waterbottle.drink();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFill(){
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }


}
