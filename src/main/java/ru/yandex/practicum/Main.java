package ru.yandex.practicum;

import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Food meet = new Meat(5, 10);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");
        Food[] food = {meet, redApple,greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println(shoppingCart.getSumInService());
        System.out.println(shoppingCart.getSumInService());
        System.out.println(shoppingCart.getSumInService());
    }
}
