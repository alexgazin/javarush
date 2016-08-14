package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

/**
 * Created by pr0jector on 20.07.2016.
 */
public class Tablet
{
    final int number;

    public Tablet(int number)
    {
        this.number = number;
    }

    public void createOrder() {
        Order order = new Order();
    }
}
