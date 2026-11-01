package com.nhuche;

import java.time.DayOfWeek;

public sealed interface Cadence {
    record Daily() implements Cadence {}
    record Weekdays(DayOfWeek... days) implements Cadence {}
    record Monthdays(int... days) implements Cadence {}
    record Monthweeks(DayOfWeek day, int... weeks) implements Cadence {}

    public static Daily daily() {
        return new Daily();
    }
    public static Weekdays weekdays(DayOfWeek... days) {
        return new Weekdays(days);
    }
    public static Monthdays monthdays(int... days) {
        return new Monthdays(days);
    }
    public static Monthweeks monthweeks(DayOfWeek day, int... weeks) {
        return new Monthweeks(day, weeks);
    }
}
