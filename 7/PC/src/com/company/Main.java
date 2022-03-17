package com.company;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 10);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.22");
//
//        PC pc = new PC(theCase, monitor, motherboard);
//        pc.powerUp();

//        Room room = new Room(4, 1);
//        House house = new House(room);
//        System.out.println(house.room.getBed());
//        System.out.println(house.room.getChairs());
//        System.out.println((new House(new Room(5,2))).room.getChairs());
//        System.out.println((new House(new Room(5,2))).room.getBed());
//
//        house.clearHouse();

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
    }
}
