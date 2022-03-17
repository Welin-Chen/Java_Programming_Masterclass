package com.welin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge2 {
    public static void main(String[] args) {


        Function<String, String> lambdaFunction = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String source = "1234567890";

        String result = everySecondCharacter(lambdaFunction, source);
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        System.out.println("-----------------");
//        List<String >firstUpperCaseList=new ArrayList<>();
//        topNames2015.forEach(name->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1)));
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

//        topNames2015.stream()
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);


        long namesBeginningWithA = topNames2015.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("names Beginning With A is: " + namesBeginningWithA);

        topNames2015
                .stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
