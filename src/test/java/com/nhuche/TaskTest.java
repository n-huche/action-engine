package com.nhuche;
import com.nhuche.exception.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

public class TaskTest {

    Task task1;
    Task task2;
    Task task3;

    @BeforeEach
    void creationMultipleTasks() {
        Task.create(TaskType.UNIQUE_PROJECT, "Goal 1")
            .link("Project 1")
            .add();

        Task.create(TaskType.RECURRING_PROJECT, "Goal 2")
            .link("Project 2")
            .doUntil(LocalDate.of(2026, 11, 19))
            .cadence(Cadence.daily())
            .add();

        Task.create(TaskType.RECURRING_INDEPENDENT, "Goal 3")
            .doUntil(LocalDate.of(2026, 11, 24))
            .cadence(Cadence.monthdays(15))
            .add();
    }

    /////////////////////////////////////
    /// LINK TASK VERIFIER VALIDATION ///
    /////////////////////////////////////
    
    @Test
    void defineProjectTaskLink() {
        Task task = Task.create(TaskType.UNIQUE_PROJECT, "Goal 4")
                        .link("Project 4")
                        .add();
        assertTrue(Task.getTaskList().contains(task)); 
    }

    @Test
    void projectTaskWithoutLinkThrowsException(){
        assertThrows(LinkNotDefinedException.class, () -> {
            Task.create(TaskType.UNIQUE_PROJECT, "Goal 4")
                .add();
        });
    } 

    @Test
    void nonProjectTaskWithLinkThrowsException(){
        assertThrows(NoProjectTaskFoundException.class, () -> {
            Task.create(TaskType.UNIQUE_INDEPENDENT, "Goal 4")
                .link("Project 4")
                .add();
        });
    } 

    ////////////////////////////////////////
    /// DOUNTIL TASK VERIFIER VALIDATION ///
    ////////////////////////////////////////
    
    @Test
    void defineRecurrentTaskDoUntil() {
        Task task = Task.create(TaskType.RECURRING_PROJECT, "Goal 4")
                        .link("Project 4")
                        .doUntil(LocalDate.of(2026, 11, 20))
                        .cadence(Cadence.monthweeks(DayOfWeek.MONDAY, 1, 2))
                        .add();
        assertTrue(Task.getTaskList().contains(task)); 
    }

    @Test
    void recurringTaskWithoutDoUntilThrowsException(){
        assertThrows(DoUntilNotDefinedException.class, () -> {
            Task.create(TaskType.RECURRING_INDEPENDENT, "Goal 4")
                .cadence(Cadence.monthdays(4, 9))
                .add();
        });
    } 

    @Test
    void nonRecurringTaskWithDoUntilThrowsException(){
        assertThrows(NoRecurringTaskFoundException.class, () -> {
            Task.create(TaskType.UNIQUE_INDEPENDENT, "Goal 4")
                .doUntil(LocalDate.of(2026, 11, 23))
                .add();
        });
    } 

    ////////////////////////////////////////
    /// CADENCE TASK VERIFIER VALIDATION ///
    ////////////////////////////////////////
    
    @Test
    void defineCadenceTaskCadence() {
        Task task = Task.create(TaskType.MAINTENANCE, "Goal 4")
                        .link("Project 4")
                        .cadence(Cadence.monthweeks(DayOfWeek.MONDAY, 1, 2))
                        .add();
        assertTrue(Task.getTaskList().contains(task)); 
    }

    @Test
    void cadenceTaskWithoutCadenceThrowsException(){
        assertThrows(CadenceNotDefinedException.class, () -> {
            Task.create(TaskType.RECURRING_INDEPENDENT, "Goal 4")
                .doUntil(LocalDate.of(2026, 12, 10))
                .add();
        });
    } 

    @Test
    void nonCadenceTaskWithCadenceThrowsException(){
        assertThrows(NoCadenceTaskFoundException.class, () -> {
            Task.create(TaskType.UNIQUE_INDEPENDENT, "Goal 4")
                .cadence(Cadence.daily())
                .add();
        });
    } 

    //////////////////////////////////////
    /// ADD METHOD VERIFIER VALIDATION ///
    //////////////////////////////////////

    @Test
    void taskWithGoalIsAddOnTheList() {
        Task task = Task.create(TaskType.RECURRING_INDEPENDENT, "Goal 4")
                        .add();
        assertTrue(Task.getTaskList().contains(task));
    }

    @Test
    void taskWithoutTypeThrowsException() {
        assertThrows(TaskTypeNotDefinedException.class, () -> {
            Task.create(null, "Goal 4")
                .add();
        });
    }

    @Test 
    void taskWithoutGoalThrowsException() {
        assertThrows(GoalNotDefinedException.class, () -> {
            Task.create(TaskType.UNIQUE_INDEPENDENT, "")
                .add();
        });
    }

    //////////////////////
    /// NEWTASK METHOD ///
    //////////////////////
    
    @Test
    void TestingIfNewTaskMethodWorks() {
        Task task = Task.newTask(TaskInterface.recurringIndependent("Goal 4", 
                                                        "Action", 
                                                        LocalTime.of(11, 10), 
                                                        LocalDate.of(2026, 12, 7), 
                                                        LocalDate.of(2027, 1, 28), 
                                                        Cadence.daily()));
    }
}