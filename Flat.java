package com.dmdev.oop.homework;

public class Flat {

    private int number;
    private Room[] rooms;
    private static int count;

    public Flat() {

    }

    public Flat(int number, Room[] rooms) {
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

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flat.count = count;
    }

    public void print() {
        System.out.println("Квартир: " + number + " количество комнат " + Room.getCount());
    }
}
