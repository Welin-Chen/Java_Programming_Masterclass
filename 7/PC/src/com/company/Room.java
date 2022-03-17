package com.company;

public class Room {
    private int chairs;
    private int bed;

    public Room(int chairs, int bed) {
        this.chairs = chairs;
        this.bed = bed;
    }

    public void clearRoom(){
        System.out.println("clear room");
    }
    public int getChairs() {
        return chairs;
    }

    public int getBed() {
        return bed;
    }
}
