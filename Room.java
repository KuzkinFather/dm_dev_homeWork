package com.dmdev.oop.homework;

import java.util.SortedMap;

public class Room {
    private boolean walkThrough;
    public static int count;

    public Room() {

    }

    public Room(boolean walkThrough) {
        this.walkThrough = walkThrough;
        count++;
    }

    public boolean isWalkThrough() {
        return walkThrough;
    }

    public void setWalkThrough(boolean walkThrough) {
        this.walkThrough = walkThrough;
    }

    public static int getCount() {
        return count;
    }

    public void print() {
        if (walkThrough == true) {
            System.out.println(getCount() + " - Эта комната проходная" );
        } else System.out.println(getCount() + " - Эта комната не проходная");
    }
}
