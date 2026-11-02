package com.nhuche;

import java.time.*;

public sealed interface TaskInterface {

    //////////////////////////
    /// Task Types Records ///
    //////////////////////////

    public record UniqueIndependent(String goal, 
                                    String action, 
                                    LocalTime doAt, 
                                    LocalDate doOn) implements TaskInterface {}

    public record UniqueProject(String goal, 
                                String action, 
                                String link, 
                                LocalTime doAt, 
                                LocalDate doOn) implements TaskInterface {}

    public record RecurringIndependent(String goal, 
                                        String action, 
                                        LocalTime doAt, 
                                        LocalDate doOn,
                                        LocalDate doUntil,
                                        Cadence cadence) implements TaskInterface {}

    public record RecurringProject(String goal, 
                                    String action, 
                                    String link, 
                                    LocalTime doAt, 
                                    LocalDate doOn,
                                    LocalDate doUntil,
                                    Cadence cadence) implements TaskInterface {}

    public record Manteinance(String goal, 
                                String action, 
                                LocalTime doAt, 
                                LocalDate doOn,
                                Cadence cadence) implements TaskInterface {}

    ///////////////////////
    /// FACTORY METHODS ///
    ///////////////////////

    public static UniqueIndependent uniqueIndependent(String goal, 
                                                        String action, 
                                                        LocalTime doAt, 
                                                        LocalDate doOn) {
                                                            return new UniqueIndependent(goal, 
                                                                                        action, 
                                                                                        doAt, 
                                                                                        doOn);
                                                        }
    public static UniqueProject uniqueProject(String goal, 
                                                String action,
                                                String link,
                                                LocalTime doAt, 
                                                LocalDate doOn) {
                                                    return new UniqueProject(goal, 
                                                                            action, 
                                                                            link,
                                                                            doAt, 
                                                                            doOn);
                                                }
    public static RecurringIndependent recurringIndependent(String goal, 
                                                            String action, 
                                                            LocalTime doAt, 
                                                            LocalDate doOn,
                                                            LocalDate doUntil,
                                                            Cadence cadence) {
                                                                return new RecurringIndependent(goal, 
                                                                                                action, 
                                                                                                doAt,
                                                                                                doOn,
                                                                                                doUntil,
                                                                                                cadence);
                                                            }
    public static RecurringProject recurringProject(String goal, 
                                                    String action,
                                                    String link,
                                                    LocalTime doAt, 
                                                    LocalDate doOn,
                                                    LocalDate doUntil,
                                                    Cadence cadence) {
                                                        return new RecurringProject(goal, 
                                                                                    action,
                                                                                    link,
                                                                                    doAt,
                                                                                    doOn,
                                                                                    doUntil,
                                                                                    cadence);
                                                    }
    public static Manteinance manteinance(String goal,
                                            String action,
                                            LocalTime doAt, 
                                            LocalDate doOn,
                                            Cadence cadence) {
                                                return new Manteinance(goal, 
                                                                            action,
                                                                            doAt,
                                                                            doOn,
                                                                            cadence);
                                            }
}
