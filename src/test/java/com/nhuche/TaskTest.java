package com.nhuche;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    Task task1;
    Task task2;
    Task task3;


    @BeforeEach
    void creationMultipleTasks() {
        task1 = new Task();
        task1.type(TaskType.UNIQUE_PROJECT)
                .goal("Goal 1")
                .add();

        task2 = new Task();
        task2.type(TaskType.RECURRING_PROJECT)
                .goal("Goal 2")
                .add();

        task3 = new Task();
        task3.type(TaskType.RECURRING_INDEPENDENT)
                .goal("Goal 3")
                .add();
    }

    @Test
    void taskWithGoalIsAddOnTheList() {
        Task task4 = new Task();
        task4.type(TaskType.RECURRING_INDEPENDENT)
                .goal("Goal 4")
                .add();
        assertTrue(Task.getTaskList().contains(task4));
    }

    @Test
    void taskWithoutTypeThrowsException() {
        assertThrows(TaskTypeNotDefinedException.class, () -> {
            Task task4 = new Task();
            task4.goal("Goal 4")
                    .add();
        });
    }


    @Test 
    void taskWithoutGoalThrowsException() {
        assertThrows(GoalNotDefinedException.class, () -> {
            Task task4 = new Task();
            task4.type(TaskType.UNIQUE_INDEPENDENT)
                    .add();
        });
    }

    @Test
    void addInGetTaskListThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            Task task4 = new Task();
            Task.getTaskList().add(task4);
        });
    }

    @Test 
    void testingTaskTypeAsTypeMethodInput() {
        Task task4 = new Task();
        task4.type(TaskType.UNIQUE_INDEPENDENT);
        assertEquals(task4.getType(), TaskType.UNIQUE_INDEPENDENT);
    }
}