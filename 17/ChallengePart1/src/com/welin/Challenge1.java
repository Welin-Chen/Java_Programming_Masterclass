package com.welin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {

    public static void main(String[] args) {
        // write your code here
        String challenge1 = "I want a bike.";
        String challenge1RegExp = "^I want a bike.$";
        System.out.println(challenge1.matches(challenge1RegExp));

        String challenge2 = "I want a ball.";
//        String challenge2RegExp = "^I want a.*";
//        String challenge2RegExp = "^I want a \\w+.";
        String challenge2RegExp = "^I want a (bike|ball).";

        System.out.println(challenge1.matches(challenge2RegExp));
        System.out.println(challenge2.matches(challenge2RegExp));


        System.out.println("--------------");
        String regExp3 = "^I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        System.out.println("--------------");
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        System.out.println("--------------");
        String challenge5 = "aaabccccccccddeffg";
        System.out.println(challenge5.matches("a+b*c+d+e*f+g*"));
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]*"));
        System.out.println(challenge5.matches("aaabccccccccddeffg"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{2}ef{2}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{2}ef{2}g$", "Replaced"));

        System.out.println("--------------");
        String challenge7 = "affbcd.123";
        String regExp7 = "^[a-zA-Z]+\\.\\d+$";
        System.out.println(challenge7.matches(regExp7));
        System.out.println(challenge7.replaceAll(regExp7, "Replaced"));

        System.out.println("--------------");
        String challenge8 = "abcd.135uvqz.7tzik.999";
//        String regExp8 = "([a-zA-Z]+\\.)(\\d+)";
        String regExp8 = "[a-zA-Z]+\\.(\\d+)";
        pattern = Pattern.compile(regExp8);
        matcher = pattern.matcher(challenge8);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }

        System.out.println("--------------");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regExp9 = "([a-zA-Z]+\\.)(\\d+)(\\s)";
        pattern = Pattern.compile(regExp9);
        matcher = pattern.matcher(challenge9);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(2));
        }

        System.out.println("--------------");
        matcher.reset();
        while (matcher.find()) {
            System.out.println("Occurrence: start = " + matcher.start(2) + " end = " + (matcher.end(2) - 1));
        }

        System.out.println("--------------");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
//        String regExp11 = "\\{(\\d+, \\d+)\\}";
        String regExp11 = "\\{(.+?)\\}";
        pattern = Pattern.compile(regExp11);
        matcher = pattern.matcher(challenge11);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }

        System.out.println("--------------");
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x ,y}, {6, 34}, {11, 12}";
        String regExp11a = "\\{(\\d+, \\d+)\\}";
        pattern = Pattern.compile(regExp11a);
        matcher = pattern.matcher(challenge11a);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }

        System.out.println("--------------");
        String challenge11b = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x ,y}, {6, 34}, {11, 12}";
        String regExp11b = "\\{(\\d),( \\d)\\}";
        pattern = Pattern.compile(regExp11b);
        matcher = pattern.matcher(challenge11b);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1) + matcher.group(2));
        }

        System.out.println("--------------");
        String challenge12="11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        System.out.println("--------------");
        String challenge13="11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        System.out.println("--------------");
        String regExp="^\\d{5}(-\\d{4}$)?";
        System.out.println(challenge12.matches(regExp));
        System.out.println(challenge13.matches(regExp));

    }
}
