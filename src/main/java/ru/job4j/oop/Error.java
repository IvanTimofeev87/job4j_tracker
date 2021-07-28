package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error errorSystem = new Error();
        Error errorApplication = new Error(true, 12, "Critical error");
        Error errorNetwork = new Error(false, 13, "Destination host unreachable");
        errorSystem.printInfo();
        errorApplication.printInfo();
        errorNetwork.printInfo();
    }
}
