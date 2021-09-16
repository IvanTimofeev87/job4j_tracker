package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setPersona("Timofeev Ivan Alekseevich");
        student.setGroup("Intern");
        student.setDate(new Date());

        System.out.println("Student: " + student.getPersona() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "The date of admission: " + student.getDate());
    }
}
