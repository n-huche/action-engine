package com.nhuche;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    Task task1;
    Task task2;
    Task task3;


    @BeforeEach
    void creationMultipleTasks() {
        task1 = new Task();
        task1.goal("Goal 1");
        task1.add();

        task2 = new Task();
        task2.goal("Goal 2");
        task2.add();

        task3 = new Task();
        task3.goal("Goal 3");
        task3.add();
    }

    @Test
    void taskWithGoalIsAddOnTheList() {
        Task task4 = new Task();
        task4.goal("Goal 4");
        task4.add();
        assertTrue(Task.getTaskList().contains(task4));
    }

    @Test 
    void taskWithoutGoalThrowsException() {
        assertThrows(GoalNotDefinedException.class, () -> {
            Task task4 = new Task();
            task4.action("Action 4");
            task4.add();
        });
    }
}
