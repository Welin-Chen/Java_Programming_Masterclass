package com.company;

public class House {
    Room room;

    public House(Room room) {
        this.room = room;
    }

    public void clearHouse(){
        System.out.println("clear house");
        room.clearRoom();
    }
}
