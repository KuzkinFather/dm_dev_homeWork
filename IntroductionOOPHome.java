package com.dmdev.oop.homework;

public class IntroductionOOPHome {

    private int number;
    private IntroductionOOPFloor[] floors;
    private static int count;


    public IntroductionOOPHome() {

    }

    public IntroductionOOPHome(int number, IntroductionOOPFloor[] floors) {
        this.number = number;
        this.floors = floors;
        count++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public IntroductionOOPFloor[] getFloors() {
        return floors;
    }

    public void setFloors(IntroductionOOPFloor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом номер: " + number + " количество этажей " + IntroductionOOPFloor.count);
    }
}
