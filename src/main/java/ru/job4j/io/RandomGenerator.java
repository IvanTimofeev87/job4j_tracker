package ru.job4j.io;

import java.util.Random;

public class RandomGenerator {
    public static String createAnswer() {
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            return "Да";
        } else if (answer == 1) {
            return "Нет";
        }
        return "Может быть";
    }
}
