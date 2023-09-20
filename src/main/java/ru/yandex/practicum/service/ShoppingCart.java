package ru.yandex.practicum.service;

import ru.yandex.practicum.model.Food;

public class ShoppingCart {
    Food[] food = new Food;
    public ShoppingCart(Food[] food){
        this.food = food;
    }
    // получить общую сумму товаров в корзине без скидки,
    public double getSumInService() {
        double sum;
        for (int i = 0; i < food.length; i++) {
            food[i].amount * food[i].
        }
    }
    // получить общую сумму товаров в корзине со скидкой,
    // получить общую сумму всех вегетарианских продуктов в корзине без скидки.
}
