package tech.araopj;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Random().ints(Integer.MIN_VALUE, Integer.MAX_VALUE)
                .limit(Byte.MAX_VALUE)
                .forEach(randomNumber -> System.out.println("randomNumber = " + randomNumber));
    }
}