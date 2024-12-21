   // Defining an enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enum {


    public static void main(String[] args) {
        // Accessing enum values
        Day today = Day.FRIDAY;
        System.out.println("Today is : " + today);

        // Using values() method
        System.out.println("All days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Using ordinal() method
        System.out.println("Ordinal of " + today + ": " + today.ordinal());

        // Using valueOf() method
        Day specificDay = Day.valueOf("MONDAY");
        System.out.println("Specific day: " + specificDay);
    }
}
