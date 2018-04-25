/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author LoneStar
 */
public class CarTest {
     Car car;
    
    public CarTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        car = new Car("Ford", "Fusion", 2018, 175);
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of setModelYear method, of class Car.
     */
    @Test
    public void testSetModelYear()
    {
        car.setModelYear(2017);
        assertEquals(2017, car.getModelYear());
    }
    
    /**
     * Test of setModelYear method, of class Car.
     */
    @Test
    public void testSetModelYearInvalidOld()
    {
        try{
            car.setModelYear(1800);
            fail("model year of 1800 in car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("model year too old: %s%n", e.getMessage());
        }
    }
    
    /**
     * Test of setModelYear method, of class Car.
     */
    @Test
    public void testSetModelYearInvalidFuture()
    {
        try{
            car.setModelYear(2020);
            fail("model year of 2020 in car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("model year in the future: %s%n", e.getMessage());
        }
    }

    /**
     * Test of setMaxSpeed method, of class Car.
     */
    @Test
    public void testSetMaxSpeed()
    {
        car.setMaxSpeed(100);
        assertEquals(100, car.getMaxSpeed());
    }

    @Test
    public void testSetMaxSpeedInvalidHigh()
    {
        try{
            car.setMaxSpeed(601);
            fail("max speed of 601 in car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("max speed too high: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid max speed should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetMaxSpeedInvalidLow()
    {
        try{
            car.setMaxSpeed(0);
            fail("max speed of 0 in car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("max speed of 0: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid max speed should trigger an IllegalArgumentException");
        }
    }
    
    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake()
    {
        String expResult = "Ford";
        String result = car.getMake();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMake method, of class Car.
     */
    @Test
    public void testSetMake()
    {
        car.setMake("Toyota");
        assertEquals("Toyota", car.getMake());
    }
    
    @Test
    public void testInvalidMake()
    {
        try{
            car.setMake("Jdub mobile");
            fail("make of JDub mobile should have triggered an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("invalid make: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid make should trigger an IllegalArgumentException");
        }
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel()
    {
        String result = car.getModel();
        assertEquals("Fusion", result);
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel()
    {
        String model = "F150";
        car.setModel(model);
        assertEquals(model, car.getModel());
    }

    @Test
    public void testInvalidModel()
    {
        try{
            car.setModel("");
            fail("empty model should have triggered an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("invalid model: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid model should trigger an IllegalArgumentException");
        }
    }



    /**
     * Test of getMaxSpeed method, of class Car.
     */
    @Test
    public void testGetMaxSpeed()
    {
        int expResult = 175;
        int result = car.getMaxSpeed();
        assertEquals(expResult, result);
    }

    /**
     * Test of poweredBy method, of class Car.
     */
    @Test
    public void testPoweredBy()
    {
        String expResult = "gas or diesel engine";
        String result = car.poweredBy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModelYear method, of class Car.
     */
    @Test
    public void testGetModelYear()
    {
        int expResult = 2018;
        int result = car.getModelYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testCarAsTransport()
    {
        if (!Transport.class.isAssignableFrom(Car.class))
            fail("The Car class is using the Transport interface");
    }    
}