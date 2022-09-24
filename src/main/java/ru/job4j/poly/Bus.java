package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void howDrive() {
        System.out.println("We travel by bus");
    }

    @Override
    public int numbersOfPassengers(int numbers) {
        return numbers;
    }

    @Override
    public double numberForRefueling(double fuel) {
        double priceOfFuel = 1;
        double cost = priceOfFuel * fuel;
        return cost;
    }
}
