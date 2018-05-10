package com.designpatterns.exercise;

public class Paladin implements Hero {

    public void fightWithEnemy(Weapon weapon) {
        if (weapon.equipHero().equals("Sword and shield")){
            System.out.println("Paladin won!");
        }
        else
            System.out.println("Paladin lost!");
    }
}
