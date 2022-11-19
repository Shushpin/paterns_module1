package com.module;

import javax.sound.midi.Soundbank;

public class TimeTable {
    public void Chek_Schedule(FabStation creator)
    {
        System.out.println();
        System.out.println("\t\t\t\t\tTIMETABLE:");
        System.out.println(creator.TimeTable(1));
        System.out.println(creator.TimeTable(2));
        System.out.println(creator.TimeTable(3));
    }
    //просто виводить всі маршрути
}
