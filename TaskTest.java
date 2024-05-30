/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
//import static org.junit.Assert.*;
/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    
    public TaskTest() {
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
    }

    /**
     * Test of setTaskName method, of class Task.
     */
    @Test
    public void testSetTaskName() {
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
    }

    /**
     * Test of setTaskNumber method, of class Task.
     */
    @Test
    public void testSetTaskNumber() {
    }

    /**
     * Test of getTaskDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
    }

    /**
     * Test of setTaskDescription method, of class Task.
     */
    @Test
    public void testSetTaskDescription() {
    }

    /**
     * Test of getDeveloperDetails method, of class Task.
     */
    @Test
    public void testGetDeveloperDetails() {
    }

    /**
     * Test of setDeveloperDetails method, of class Task.
     */
    @Test
    public void testSetDeveloperDetails() {
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
    }

    /**
     * Test of setTaskDuration method, of class Task.
     */
    @Test
    public void testSetTaskDuration() {
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
    }

    /**
     * Test of setTaskID method, of class Task.
     */
    @Test
    public void testSetTaskID() {
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @Test
    public void testGetTaskStatus() {
    }

    /**
     * Test of setTaskStatus method, of class Task.
     */
    @Test
    public void testSetTaskStatus() {
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        Task obj=new Task("Login Feature",0, "Create login to authenticate users", "Robin Harrison",8,"", "To Do");
        boolean expected= false;
        boolean actual= obj.checkTaskDescription();
        assertEquals(expected,actual);
        Task testobj2 = new Task("Add Task Feature",0, "Create Add Task Feature to Add Task users","Mike Smith",10,"","Doing");
        boolean expected2= false;
        boolean actual2= testobj2.checkTaskDescription();
        assertEquals(expected,actual);
    }

    /**
     * Test of TaskID method, of class Task.
     */
    @Test
    public void testTaskID() {
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
    }
    
}
