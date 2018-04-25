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
 * @author Jacob Rodgers 200320013
 */
public class PowerBoatTest {
     PowerBoat boat;
    
    public PowerBoatTest()
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
        boat = new PowerBoat(600, 28, 55, 2010, "Regal", "Express");
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getHorsePower method, of class PowerBoat.
     */
    @Test
    public void testGetHorsePower()
    {
        int expResult = 600;
        int result = boat.getHorsePower();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModelYear()
    {
        int expResult = 2010;
        int result = boat.getModelYear();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLength()
    {
        int expResult = 28;
        int result = boat.getLength();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModel()
    {
        String expResult = "Express";
        String result = boat.getModel();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetMake()
    {
        String expResult = "Regal";
        String result = boat.getMake();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setHorsePower method, of class PowerBoat.
     */
    @Test
    public void testSetHorsePower()
    {
        boat.setHorsePower(500);
        assertEquals(500, boat.getHorsePower());
    }

    @Test
    public void testSetHPInvalidHigh()
    {
        try{
            boat.setHorsePower(2001);
            fail("HorsePower of 2001 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid HP: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid HP should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetModelYearInvalidHigh()
    {
        try{
            boat.setModelYear(2020);
            fail("model year of 2020 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid model Year: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid model year should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetModelYearInvalidLow()
    {
        try{
            boat.setModelYear(1300);
            fail("model year of 1300 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("low invalid model Year: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid model year should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetLengthInvalidHigh()
    {
        try{
            boat.setLength(2000);
            fail("length of 2000 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid length: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid length should trigger an IllegalArgumentException");
        }
    }
    
     @Test
    public void testSetLengthInvalidLow()
    {
        try{
            boat.setLength(2);
            fail("length of 2 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("low invalid length: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid length should trigger an IllegalArgumentException");
        }
    }
    
    
    @Test
    public void testSetMakeInvalid()
    {
        try{
            boat.setMake("");
            fail("empty make in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("empty make in PowerBoat: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("empty make should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetModelInvalid()
    {
        try{
            boat.setModel("");
            fail("empty model in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("empty model in PowerBoat: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("empty model should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetHPInvalidLow()
    {
        try{
            boat.setHorsePower(1);
            fail("HorsePower of 1 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("low invalid HP: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid HP should trigger an IllegalArgumentException");
        }
    }
    
    
    /**
     * Test of setMaxSpeed method, of class PowerBoat.
     */
    @Test
    public void testSetMaxSpeed()
    {
        boat.setMaxSpeed(200);
        assertEquals(200, boat.getMaxSpeed());
    }
    
    @Test
    public void testSetSpeedInvalidLow()
    {
        try{
            boat.setMaxSpeed(0);
            fail("Speed of 0 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("low invalid speed: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid speed should trigger an IllegalArgumentException");
        }
    }
    
        @Test
    public void testSetSpeedInvalidHigh()
    {
        try{
            boat.setMaxSpeed(201);
            fail("Speed of 201 in PowerBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid speed: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid speed should trigger an IllegalArgumentException");
        }
    }

    
    /**
     * Test of poweredBy method, of class PowerBoat.
     */
    @Test
    public void testPoweredBy()
    {
        String expResult = "gas or diesel engine";
        String result = boat.poweredBy();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPowerBoatAsBoat()
    {
        if (!Boat.class.isAssignableFrom(PowerBoat.class))
            fail("The PowerBoat class is not a subclass of Boat");
    }
    
}
