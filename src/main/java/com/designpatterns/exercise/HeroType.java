package com.designpatterns.exercise;

public enum HeroType {
    WARRIOR(1),
    MAGE(2),
    PALADIN(3);

    private final int number;

    HeroType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static HeroType heroForNumber(int number){
        for (HeroType heroType: values()){
            if(heroType.number == number)return heroType;
        }
        return null;
    }
}
