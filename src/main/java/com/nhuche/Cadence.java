package com.nhuche;

import java.time.DayOfWeek;

public sealed interface Cadence {
    record Daily() implements Cadence {}
    record Weekdays(DayOfWeek... days) implements Cadence {}
    record Monthdays(int... days) implements Cadence {}
    record Monthweeks(DayOfWeek day, int... weeks) implements Cadence {}
    
    public static Cadence daily() {
        return new Cadence.Daily();
    }
    public static Cadence weekdays(DayOfWeek... days) {
        return new Cadence.Weekdays(days);
    }
    public static Cadence monthdays(int... days) {
        return new Cadence.Monthdays(days);
    }
    public static Cadence monthweeks(DayOfWeek day, int... weeks) {
        return new Cadence.Monthweeks(day, weeks);
    }
}
