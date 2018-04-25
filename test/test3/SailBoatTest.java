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
public class SailBoatTest {
   SailBoat boat;
    public SailBoatTest()
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
        boat = new SailBoat(2, 34, 9, 2010, "Beneteau", "Oceanis");
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getNumOfMasts method, of class SailBoat.
     */
    @Test
    public void testGetNumOfMasts()
    {
        int expResult = 2;
        int result = boat.getNumOfMasts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumOfMasts method, of class SailBoat.
     */
    @Test
    public void testSetNumOfMasts()
    {
        int numOfMasts = 1;
        boat.setNumOfMasts(numOfMasts);
        assertEquals(numOfMasts, boat.getNumOfMasts());
    }

    @Test
    public void testSetNumberofMastsInvalidLow()
    {
        try{
            boat.setNumOfMasts(0);
            fail("no masts in the SailBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("0 masts in SailBoat: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("0 masts should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetNumberofMastsInvalidHigh()
    {
        try{
            boat.setNumOfMasts(10);
            fail("10 masts in the SailBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("10 masts in SailBoat: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("10 masts should trigger an IllegalArgumentException");
        }
    }

    
    /**
     * Test of getMaxSpeed method, of class SailBoat.
     */
    @Test
    public void testGetMaxSpeed()
    {
        int expResult = 9;
        int result = boat.getMaxSpeed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxSpeed method, of class SailBoat.
     */
    @Test
    public void testSetMaxSpeed()
    {
        int maxSpeed = 20;
        boat.setMaxSpeed(maxSpeed);
        assertEquals(maxSpeed, boat.getMaxSpeed());
    }

    @Test
    public void testSetSpeedInvalidLow()
    {
        try{
            boat.setMaxSpeed(0);
            fail("Speed of 0 in SailBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("low invalid speed SailBoat: %s%n", e.getMessage());
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
            boat.setMaxSpeed(76);
            fail("Speed of 76 in SailBoat class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid speed Sailboat: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid speed should trigger an IllegalArgumentException");
        }
    }


    /**
     * Test of poweredBy method, of class SailBoat.
     */
    @Test
    public void testPoweredBy()
    {
        String expResult = "wind";
        String result = boat.poweredBy();
        assertEquals(expResult, result);
    }

    @Test
    public void testSailBoatAsBoat()
    {
        if (!Boat.class.isAssignableFrom(SailBoat.class))
            fail("The SailBoat class is not a subclass of Boat");
    }
    
    @Test
    public void testBoatAsTransport()
    {
        if (!Transport.class.isAssignableFrom(Boat.class))
            fail("The SailBoat class is not a subclass of Boat");
    }
    
}
