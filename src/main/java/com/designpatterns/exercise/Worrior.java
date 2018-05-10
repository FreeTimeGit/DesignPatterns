package com.designpatterns.exercise;

public class Worrior implements Hero {

    public void fightWithEnemy(Weapon weapon) {
        if (weapon.equipHero().equals("Axe")){
            System.out.println("Worrior won!");
        }
        else
            System.out.println("Worrior lost!");
    }
}
