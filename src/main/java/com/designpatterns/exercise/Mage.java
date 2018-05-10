package com.designpatterns.exercise;

public class Mage implements Hero {

    public void fightWithEnemy(Weapon weapon) {
        if (weapon.equipHero().equals("Wand")){
            System.out.println("Mage won!");
        }
        else
            System.out.println("Mage lost!");
    }
}
