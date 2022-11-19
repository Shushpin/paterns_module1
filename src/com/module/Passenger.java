package com.module;

public class Passenger implements IntPassenger{//реалізується інтрфейс пасажира
    Boolean ticket;
    String start_pos, finish_pos;
    @Override//реалізація методу інтерфейса
    public String name() {
        return "Passenger 'Taras' ";
    }

    public Boolean Chek_Ticket(){//мало б перевіряти наявність тікета але в логіці не застосовано
      if (ticket == true){
          return true;
      } else return false;

    }
}
