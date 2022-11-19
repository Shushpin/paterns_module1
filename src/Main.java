import com.module.*;

import java.sql.Time;

public class Main {//клас реалізаці програми
    public static void main(String[] args) {
        compleate pes1 = new compleate();
        pes1.main();
        TimeTable timeTable = new TimeTable();
        timeTable.Chek_Schedule(new station());


    }
}