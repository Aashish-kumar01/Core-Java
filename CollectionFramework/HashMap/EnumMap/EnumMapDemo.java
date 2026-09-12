import java.util.EnumMap;
// import java.util.HashMap;
import java.util.Map;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // Faster than HashMap
        // Memory Efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Cardio");
        String s = map.get(Day.TUESDAY);
        System.out.println(s);
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map);
    }
}
