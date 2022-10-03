package com.dmdev.oop.homework;

public class IntroductionOOPFlat {

    private int number;
    private IntroductionOOPRoom[] rooms;
    private static int count;

    public IntroductionOOPFlat() {

    }

    public IntroductionOOPFlat(int number, IntroductionOOPRoom[] rooms) {
        this.number = number;
        this.rooms = rooms;
        count++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public IntroductionOOPRoom[] getRooms() {
        return rooms;
    }

    public void setRooms(IntroductionOOPRoom[] rooms) {
        this.rooms = rooms;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        IntroductionOOPFlat.count = count;
    }

    public void print() {
        System.out.println("Квартир: " + number + " количество комнат " + IntroductionOOPRoom.getCount());
    }
}
