package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book codeComplete = new Book("Code Complete", 100);
        Book effectiveJava = new Book("Effective Java", 200);
        Book pragmaticProgrammer = new Book("Pragmatic Programmer", 300);
        Book cleanCode = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = codeComplete;
        books[1] = effectiveJava;
        books[2] = pragmaticProgrammer;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Switch 0 and 3 index.");
        books[0] = cleanCode;
        books[3] = codeComplete;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Shown only cleanCode");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if (pr.getName() == "Clean code") {
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
    }
}
