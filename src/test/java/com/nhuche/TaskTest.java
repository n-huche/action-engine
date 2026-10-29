package com.nhuche;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    Task task1;
    Task task2;
    Task task3;


    @BeforeEach
    void creationMultipleTasks() {
        Task.create(TaskType.UNIQUE_PROJECT, "Goal 1")
            .add();

        Task.create(TaskType.RECURRING_PROJECT, "Goal 2")
            .add();

        Task.create(TaskType.RECURRING_INDEPENDENT, "Goal 3")
            .add();
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

    @Test
    void addInGetTaskListThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            Task task4 = Task.create(TaskType.UNIQUE_INDEPENDENT, "Goal 4");
            Task.getTaskList().add(task4);
        });
    }

    @Test 
    void testingTaskTypeAsCreateArgument() {
        Task task = Task.create(TaskType.UNIQUE_INDEPENDENT, "Goal 4");
        assertEquals(task.getType(), TaskType.UNIQUE_INDEPENDENT);
    }
}
