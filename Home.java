package com.dmdev.oop.homework;

public class Home {

    private int number;
    private Floor[] floors;
    private static int count;


    public Home() {

    }

    public Home(int number, Floor[] floors) {
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

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом номер: " + number + " количество этажей " + Floor.count);
    }
}
