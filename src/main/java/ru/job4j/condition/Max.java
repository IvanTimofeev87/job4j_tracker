package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
       return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(fourth, third));
    }

    public static void main(String[] args) {
        int biggestNumberFromThree = Max.max(6, 2, 7);
        System.out.println(" First number 6, second number 2,"
                + " third number 7. Biggest number is " + biggestNumberFromThree);
        int biggestNumberFromFour = Max.max(6, 2, 7, 9);
        System.out.println(" First number 6, second number 2,"
                + " third number 7, fourth number 9. Biggest number is " + biggestNumberFromFour);
    }
}
