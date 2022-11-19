package com.module;

import java.util.Random;

public class Bus implements IntBus{//реалізація інтерфейсу

    String Route;
    int Passengers;
    Random rnd = new Random();
    //змінні
    public String operation2(){
        int pas = rnd.nextInt(50);
        return "Bus/train leaves the route with " + pas + " passengers : ";
    }
    public String operation(){
        int pas = rnd.nextInt(50);
        return "Bus/train on the route with " + pas + " passengers : ";
    }
    //реалізація методів інтерфейсу




}
