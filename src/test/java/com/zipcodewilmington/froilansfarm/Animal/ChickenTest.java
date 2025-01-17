package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    private Chicken chicken;
    @Before
    public void setUp() {
        chicken = new Chicken();
    }

    @Test
    public void setHasBeenFertilized() {
        Assert.assertFalse(chicken.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilizedTrue() {
        Chicken chick = new Chicken();
        chick.setHasBeenFertilized(true);
        Assert.assertTrue(chick.isHasBeenFertilized());
    }

    @Test
    public void makeNoise() {
        String expected = "Cluck";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public <EdibleEgg> void yield() {
        chicken.setHasBeenFertilized(false);
        Egg actual = chicken.yield();
        Assert.assertNull(actual);
    }

    @Test
    public <EdibleEgg> void yield2() {
        chicken.setHasBeenFertilized(true);
        Egg actual = chicken.yield();
        Assert.assertNotNull(actual);
    }
}

