package com.dmdev.oop.homework;


public class IntroductionOOPFloor {

    private int number;
    private IntroductionOOPFlat[] flats;

    public static int count;

    public IntroductionOOPFloor() {

    }
    public IntroductionOOPFloor(int number, IntroductionOOPFlat[] flats) {
        this.number = number;
        this.flats = flats;
        count++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public IntroductionOOPFlat[] getFlats() {
        return flats;
    }

    public void setFlats(IntroductionOOPFlat[] flats) {
        this.flats = flats;
    }

    public void print() {
        System.out.println("Этаж " + number + " количество квартир " + IntroductionOOPFlat.getCount());
    }
}
