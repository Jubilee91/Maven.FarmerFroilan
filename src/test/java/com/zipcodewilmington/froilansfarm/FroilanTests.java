package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FroilanTests {


    @Test
    public void instanceOfRiderTest(){
        Assert.assertTrue(Froilan instanceof Rider);
    }

    @Test
    public void instanceOfEaterTest(){
        Assert.assertTrue(Froilan instanceof Eater);
    }

    @Test
    public void instanceOfBotanist(){
        Assert.assertTrue(Froilan instanceof Botanist);
    }

    @Test
    public void instanceOfPerson(){
        Assert.assertTrue(Froilan instanceof Person);
    }
    @Test
    public void instanceOfAnimal(){
        Assert.assertTrue(Froilan instanceof Animal);
    }
    @Test
    public void instanceOfFarmer(){
        Assert.assertTrue(Frailan instanceof Farmer);
    }
    @Test
    public void feedTest(){
        Froilan froilan = new Froilan;
        Chicken chicken1 = new Chicken;
        Earcorn earcorn = new EarCorn;

        froilan.feed(chicken1, earcorn);

        Assert.assertTrue(chicken1.eat(earcorn));

    }
    @Test
    public void speakTest(){
        Froilan froilan = new Froilan;

        String expected = "Where's my Eggs!";
        String actual = this.speak();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void eatTest(){
        Froilan froilan = new Froilaa;
        Earcorn earcorn = new EarCorn;
        Earcorn earcorn2 = new EarCorn;
        Tomato tomato1 = new Tomato;
        Egg egg1 = new Egg;
        Egg egg2 = new Egg;
        Egg egg3 = new Egg;
        Egg egg4 = new Egg;
        Egg egg5 = new Egg;


        froilan.eat(earcorn);
        froilan.eat(earcorn2);
        froilan.eat(tomato1);
        froilan.eat(egg1);
        froilan.eat(egg2);
        froilan.eat(egg3);
        froilan.eat(egg4);
        froilan.eat(egg5);

        Assert.assertTrue(froilan.isFed());
    }





}