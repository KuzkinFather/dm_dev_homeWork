package com.dmdev.oop.homework;

public class IntroductionOOPRunner {

    public static void main(String[] args) {

        IntroductionOOPRoom[] rooms = new IntroductionOOPRoom[4];
        for (int i = 0; i < rooms.length; i++) {
            if (i % 2 == 0) {
                rooms[i] = new IntroductionOOPRoom(true);
            } else {
                rooms[i] = new IntroductionOOPRoom(false);
            }
        } rooms[3].print();

        IntroductionOOPFlat[] flats = new IntroductionOOPFlat[1];
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new IntroductionOOPFlat(3,rooms);
        } flats[0].print();


        IntroductionOOPFloor[] floors = new IntroductionOOPFloor[1];
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new IntroductionOOPFloor(4,flats);
        } floors[0].print();

        IntroductionOOPHome[] home = new IntroductionOOPHome[1];
        for (int i = 0; i < home.length; i++) {
            home[i] = new IntroductionOOPHome(3,floors);

        } home[0].print();


    }

    public static void printAllInformation(IntroductionOOPHome home) {

    }

}
