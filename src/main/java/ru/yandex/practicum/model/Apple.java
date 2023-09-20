package ru.yandex.practicum.model;

public class Apple extends Food{
    public double Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        isVegetarian = true;
        if (colour.equals("red")){
            return price * 0.4;
        }
        return price;
    }
}
