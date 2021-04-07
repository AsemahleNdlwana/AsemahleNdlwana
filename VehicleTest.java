/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.group31adp2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asem
 */
public class VehicleTest {
    
    public VehicleTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public void setUpClass() {
    }
    
    @AfterAll
    public  void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCar method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testGetCar() {
        System.out.println("getCar");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.getCar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testSetCar() {
        System.out.println("setCar");
        String car = "";
        Vehicle instance = new Vehicle();
        instance.setCar(car);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Vehicle instance = new Vehicle();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        Vehicle instance = new Vehicle();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testGetColor() {
        System.out.println("getColor");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Vehicle instance = new Vehicle();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehicle.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     */
    @test(timeout=1000)
    @SuppressWarnings("timeout")
    public void timeoutTest()
    {while(true);
    }
    @Disable(timeout=1000)
    @SuppressWarnings("Disabled")
    public void DisableTest()
    
    }
}
