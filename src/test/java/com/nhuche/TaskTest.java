package com.nhuche;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    Task task1;
    Task task2;
    Task task3;


    @BeforeEach
    void creationMultipleTasks() {
        Task.create()
            .type(TaskType.UNIQUE_PROJECT)
            .goal("Goal 1")
            .add();

        Task.create()
            .type(TaskType.RECURRING_PROJECT)
            .goal("Goal 2")
            .add();

        Task.create()
        .type(TaskType.RECURRING_INDEPENDENT)
            .goal("Goal 3")
            .add();
    }

    @Test
    void taskWithGoalIsAddOnTheList() {
        Task task = Task.create()
                            .type(TaskType.RECURRING_INDEPENDENT)
                            .goal("Goal 4")
                            .add();
        assertTrue(Task.getTaskList().contains(task));
    }

    @Test
    void taskWithoutTypeThrowsException() {
        assertThrows(TaskTypeNotDefinedException.class, () -> {
            Task.create()
                    .goal("Goal 4")
                    .add();
        });
    }


    @Test 
    void taskWithoutGoalThrowsException() {
        assertThrows(GoalNotDefinedException.class, () -> {
            Task.create()
                    .type(TaskType.UNIQUE_INDEPENDENT)
                    .add();
        });
    }

    @Test
    void addInGetTaskListThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            Task task4 = Task.create();
            Task.getTaskList().add(task4);
        });
    }

    @Test 
    void testingTaskTypeAsTypeMethodInput() {
        Task task = Task.create()
                        .type(TaskType.UNIQUE_INDEPENDENT);
        assertEquals(task.getType(), TaskType.UNIQUE_INDEPENDENT);
    }
}