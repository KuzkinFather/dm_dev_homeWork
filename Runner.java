package com.dmdev.oop.homework;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Room[] rooms = new Room[4];
        for (int i = 0; i < rooms.length; i++) {
            if (i % 2 == 0) {
                rooms[i] = new Room(true);
            } else {
                rooms[i] = new Room(false);
            }
        } rooms[3].print();

        Flat[] flats = new Flat[1];
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new Flat(3,rooms);
        } flats[0].print();


        Floor[] floors = new Floor[1];
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(4,flats);
        } floors[0].print();

        Home[] home = new Home[1];
        for (int i = 0; i < home.length; i++) {
            home[i] = new Home(3,floors);

        } home[0].print();


    }

    public static void printAllInformation(Home home) {

    }

}
