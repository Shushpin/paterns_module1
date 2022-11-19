package com.module;
import java.util.*;//імпорт для ліста і рандом
import java.time.*;//імпорт для часу

public class Route implements IntRoute{//наслідували інтерфейс
    List<String> points = new ArrayList<String>();
    Random rnd = new Random();
    int weight;
    LocalDateTime time_to_finish = LocalDateTime.now();
    LocalDateTime time_to_next_stop = LocalDateTime.now();
    //задаємо змінні в класі
//time_to_finish береться дата яка зараз на компі
    public String route1()
    {
        points.add("Melehov");//зупинки але для голіки не використані
        points.add("Zolociv");//зупинки але для голіки не використані
        points.add("Sknilov");//зупинки але для голіки не використані
        weight = 600;//довжина маршруту
        return"(Lviv-Kyiv"+ weight +"km)";//це виводить маршрут і довжину
    }
    public String route1_time()//тут реалізується час прибуття і час наступної зупинки
    {
        int min = rnd.nextInt(5);
        int sec = rnd.nextInt(60);
        time_to_finish = time_to_finish.plusHours(5);
        time_to_finish = time_to_finish.plusMinutes(37);
        time_to_next_stop = time_to_next_stop.plusMinutes(min);
        time_to_next_stop = time_to_next_stop.plusSeconds(sec);

        return " Finish Time: [" + time_to_finish + "] Next Stop: [" + time_to_next_stop + "]";
    }
    public String route2()
    {
        points.add("Ivano-Frankivsk");
        points.add("Chernovchy");
        points.add("Vinnitsa");
        weight = 1000;
        return"(Lviv-Odesa" + weight + "km)";
    }
    public String route2_time()
    {
        int min = rnd.nextInt(5);
        int sec = rnd.nextInt(60);
        time_to_finish = time_to_finish.plusHours(10);
        time_to_finish = time_to_finish.plusMinutes(29);
        time_to_next_stop = time_to_next_stop.plusMinutes(min);
        time_to_next_stop = time_to_next_stop.plusSeconds(sec);

        return " Finish Time: [" + time_to_finish + "] Next Stop: [" + time_to_next_stop + "]";
    }
    public String route3()
    {
        points.add("Slovita");
        points.add("Zolochiv");
        points.add("Zboriv");
        weight = 120;
        return"(Lviv-Ternopil"+ weight + "km)";
    }
    public String route3_time()
    {
        int min = rnd.nextInt(5);
        int sec = rnd.nextInt(60);
        time_to_finish = time_to_finish.plusHours(2);
        time_to_finish = time_to_finish.plusMinutes(19);
        time_to_next_stop = time_to_next_stop.plusMinutes(min);
        time_to_next_stop = time_to_next_stop.plusSeconds(sec);

        return " Finish Time: [" + time_to_finish + "] Next Stop: [" + time_to_next_stop + "]";
    }
}

