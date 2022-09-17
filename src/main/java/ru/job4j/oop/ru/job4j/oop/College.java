package ru.job4j.oop.ru.job4j.oop;

import ru.job4j.oop.Freshman;
import ru.job4j.oop.Student;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();

        Student student = freshman;

        Object ostudent = student;
    }
}
