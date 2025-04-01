package corejava.collections;

import java.util.EnumMap;
import java.util.Map;

public class A9EnumMap {

    public static void main(String[] args) {
          EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

        // Adding key-value pairs
        schedule.put(Day.MONDAY, "Work");
        schedule.put(Day.TUESDAY, "Gym");
        schedule.put(Day.SATURDAY, "Relax");
        schedule.put(Day.SUNDAY, "Family Time");

        // Printing the EnumMap
        System.out.println("EnumMap: " + schedule);

        // Accessing a value
        System.out.println("Activity on Monday: " + schedule.get(Day.MONDAY));

        // Iterating over the EnumMap
        System.out.println("\nSchedule:");
        for (Map.Entry<Day, String> entry : schedule.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
