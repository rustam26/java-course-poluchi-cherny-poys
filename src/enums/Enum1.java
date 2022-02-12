package enums;

import java.util.Arrays;

public class Enum1 {

    public static void main(String[] args) {
        ToDay toDay = new ToDay(WeekDays.SATURDAY);
        toDay.daysInfo();

        System.out.println(toDay.weekDay);
        WeekDays w1 = WeekDays.SATURDAY;
        WeekDays w2 = WeekDays.SATURDAY;
        WeekDays w3 = WeekDays.MONDAY;

        System.out.println(w1 == w3);
        System.out.println(WeekDays.SATURDAY.equals(WeekDays2.SATURDAY));

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));

    }

}


enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY(),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    private WeekDays() {
    }

    public String getMood() {
        return mood;
    }

}


enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY(),
    SATURDAY,
    SUNDAY;
}

class ToDay {
    WeekDays weekDay;

    public ToDay(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na rabotu!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdoxnut");
                break;
        }
        System.out.println("Nastroenie v etot den: " + weekDay.getMood());
    }

}
