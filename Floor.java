package com.dmdev.oop.homework;


public class Floor {

    private int number;
    private Flat[] flats;

    public static int count;

    public Floor() {

    }
    public Floor(int number, Flat[] flats) {
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

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public void print() {
        System.out.println("Этаж " + number + " количество квартир " + Flat.getCount());
    }
}
