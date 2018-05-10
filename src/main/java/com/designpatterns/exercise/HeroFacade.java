package com.designpatterns.exercise;

import java.util.Scanner;

public class HeroFacade {

    private HeroFactory hero;
    private Weapon weapon;

    public HeroFacade(final int weaponChoice) {
        final Scanner scanner = new Scanner(System.in);
        hero = HeroFactory.getInstance();
        weapon = new Weapon() {
            public String equipHero() {
                if(weaponChoice == 1){
                    return new Wand().equipHero();
                }
                else if(weaponChoice == 2){
                    return new SwordAndShield().equipHero();
                }
                else
                    return new Axe().equipHero();
            }
        };
    }
    public void processHero(int heroChoice){
        hero.createHero(HeroType.heroForNumber(heroChoice)).fightWithEnemy(weapon);

    }
}
