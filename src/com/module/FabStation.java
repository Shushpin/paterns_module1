package com.module;

public abstract class FabStation {
    public abstract IntBus BusMethod();
    public abstract IntRoute RouteMethod();
    public abstract IntPassenger PassengerMethod();


    public String addPassenger(){
        var Route = RouteMethod();
        var Passenger = PassengerMethod();
        var res = Passenger.name() + "Joined the route:" + Route.route3();
        return res;
    }
    public String Remove_Pessenger()
    {
        var route = RouteMethod();
        var pess = PassengerMethod();
        var result = pess.name() + " left the route: " + route.route3();
        return result;
    }
    public String Createroute()
    {
        // Викликаємо фабричний метод, щоби отримати об'єкт-продукт.
        var bus = BusMethod();
        var route = RouteMethod();

        var result = "Station: " + bus.operation() + route.route1() + route.route1_time();

        return result;
    }
    public String Deleteroupe()
    {
        var bus = BusMethod();
        var route = RouteMethod();
        var result = "Station: " + bus.operation2() + route.route2() + route.route2_time();

        return result;
    }
    public String TimeTable(int a)
    {
        var route = RouteMethod();
        switch (a) {
            case 1:
                var result = route.route1() + route.route1_time();
                return result;
//            break;
            case 2:
                var result2 = route.route2() + route.route2_time();
                return result2;
//            break;
            case 3:
                var result3 = route.route3() + route.route3_time();
                return result3;
//            break;
            default: return "Error";
        }

    }
}
