package com.designpatterns.exercise;

public class HeroFactory {

    private static HeroFactory heroFactory = null;

    private HeroFactory(){

    }

    public static HeroFactory getInstance(){
        if(heroFactory == null){
            heroFactory = new HeroFactory();
        }
            return heroFactory;
    }

    public Hero createHero(HeroType heroType){
        switch (heroType){
            case WARRIOR:
                return new Worrior();
            case MAGE:
                return new Mage();
            case PALADIN:
                return new Paladin();
        }
        throw new RuntimeException("You cannot to fight with enemy alone");
    }
}
