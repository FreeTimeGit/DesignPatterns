package com.designpatterns.exercise;

import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {


//        HeroFactory heroFactory = HeroFactory.getInstance();
//        Hero hero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your hero:");
        System.out.println("1. Worrior");
        System.out.println("2. Mage");
        System.out.println("3. Paladin");
        int heroChoice = scanner.nextInt();
//        hero = heroFactory.createHero(HeroType.values()[heroChoice-1]);
//        hero = heroFactory.createHero(HeroType.heroForNumber(heroChoice));
        System.out.println("Choose your weapon:");
        System.out.println("1. Wand");
        System.out.println("2. Sword and Shield");
        System.out.println("3. Axe");
        int heroWeapon = scanner.nextInt();
        HeroFacade heroFacade = new HeroFacade(heroWeapon);
        heroFacade.processHero(heroChoice);
//        if(heroWeapon == 1){
//            hero.fightWithEnemy(new Wand());
//        }
//        else if(heroWeapon == 2){
//            hero.fightWithEnemy(new SwordAndShield());
//        }
//        else
//            hero.fightWithEnemy(new Axe());
    }
}
