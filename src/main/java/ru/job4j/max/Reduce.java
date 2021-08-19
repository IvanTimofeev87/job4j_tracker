package ru.job4j.max;

public class Reduce {

    private int[] arrayOfElements;

    public void to(int[] array) {
        arrayOfElements = array;
    }

    public void print() {
        for (int index = 0; index < arrayOfElements.length; index++) {
            System.out.println(arrayOfElements[index]);
        }
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        Reduce first = new Reduce();
        first.to(firstArray);
        first.print();
    }
}
