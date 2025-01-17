package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.StorageUnits.ChickenCoop;
import com.zipcodewilmington.froilansfarm.StorageUnits.StorageUnit;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void instanceOfStorageUnitTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Assert.assertTrue(chickenCoop instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Integer expected = 1;
        //when
        chickenCoop.add(chicken);
        Integer actual = chickenCoop.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);
        Integer expected = 0;
        //when
        chickenCoop.remove(chicken);
        Integer actual = chickenCoop.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);
        Chicken expected = chicken;
        //when
        Chicken actual = chickenCoop.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();

        //Then
        Assert.assertTrue(chickenCoop.isEmpty());
    }
}
