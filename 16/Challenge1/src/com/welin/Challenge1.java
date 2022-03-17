package com.welin;

public class Challenge1 {

    public static void main(String[] args) {
        // write your code here
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };
        Runnable runnable = () -> {
            String myString = "Let's split this into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };


        runnable.run();
    }
}
