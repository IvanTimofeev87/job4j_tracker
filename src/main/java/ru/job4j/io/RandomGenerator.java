package ru.job4j.io;

import java.util.Random;

public class RandomGenerator {
    public static String createAnswer() {
        int answer = new Random().nextInt(3);
        String rsl = "Может быть";
        if (answer == 0) {
            rsl = "Да";
        } else if (answer == 1) {
           rsl = "Нет";
        }
        return rsl;
    }
}
