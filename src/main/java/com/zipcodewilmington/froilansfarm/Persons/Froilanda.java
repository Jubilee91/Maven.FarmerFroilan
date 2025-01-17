package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.StorageUnits.Pantry;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;


public class Froilanda extends Person implements Pilot{
    int eatenFood=0;

    public Froilanda(){

    }

    public Froilanda(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        System.out.println("Look out below!");

        return "Look out below!";
    }


    @Override
    public void flys(CropDuster cropDuster) {
        cropDuster.fly();

    }

    @Override
    public void mount(Rideable rideable) {
        rideable.getMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.getMounted(null);
    }

    @Override
    public void feed(Animal animal, Edible edible) {
        animal.eat(edible);

    }




    @Override
    public void eat(Object o) {
        //        Pantry.remove(edible);
        this.eatenFood ++;
        if (this.eatenFood >= 5){
            this.isFed = true;
        }

    }
}
