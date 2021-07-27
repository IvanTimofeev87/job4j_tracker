package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        Ball kolobok = new Ball();
        Hare kosoy = new Hare();
        Wolf seryj = new Wolf();
        Fox ryzhaya = new Fox();
        kosoy.tryEat(kolobok);
        seryj.tryEat(kolobok);
        ryzhaya.tryEat(kolobok);
        kolobok.tryEat(kolobok);
    }
}
