package ru.yandex.practicum.model;

public class Meat extends Food{
    public void Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }
}
