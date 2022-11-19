package com.module;

public class station extends FabStation {//наслідується від класу FabStation і реалізація його методів

    @Override
    public IntBus BusMethod() {
        return (IntBus) new Bus();
    }

    @Override
    public IntRoute RouteMethod() {
        return (IntRoute) new Route();
    }

    @Override
    public IntPassenger PassengerMethod() {
        return (IntPassenger) new Passenger();
    }


}
