package com.nhuche;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;

import com.nhuche.GoalNotDefinedException;

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
    void verifingTaskSimpleDefinition() {
        Task task = new Task();
        task.goal("Fazer isso");
        assertEquals(task.getGoal(), "Fazer isso");
    }

    @Test 
    void taskWithoutGoalThrowsException() {
        assertThrows(GoalNotDefinedException.class, () -> {
            Task task4 = new Task();
            task4.action("Ação 4");
            task4.add();
        });
    }
}
