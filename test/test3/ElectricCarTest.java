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
public class ElectricCarTest {
     ElectricCar eCar;
    
    public ElectricCarTest()
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
        eCar = new ElectricCar(200, "Toyota", "Prius", 2018, 165);
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getKilowattHours method, of class ElectricCar.
     */
    @Test
    public void testGetKilowattHours()
    {
        int expResult = 200;
        int result = eCar.getKilowattHours();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKilowattHours method, of class ElectricCar.
     */
    @Test
    public void testSetKilowattHours()
    {
        int kilowattHours = 400;
        eCar.setKilowattHours(kilowattHours);
        assertEquals(kilowattHours, eCar.getKilowattHours());
    }
    
    @Test
    public void testPoweredBY()
    {
        String expResult = "electric motor";        
        String result = eCar.poweredBy();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetkWInvalidLow()
    {
        try{
            eCar.setKilowattHours(0);
            fail("KW hours of 0 in Electric Car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("KWH of 0: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid KWH speed should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testSetkWInvalidHigh()
    {
        try{
            eCar.setKilowattHours(1000);
            fail("KW hours of 1000 in Electric Car class should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("high invalid KWH: %s%n", e.getMessage());
        }
        catch (Exception e)
        {
            fail("invalid KWH speed should trigger an IllegalArgumentException");
        }
    }
    
    @Test
    public void testHelicopterAsAircraft()
    {
        if (!Car.class.isAssignableFrom(ElectricCar.class))
            fail("The ElectricCar class is not a subclass of Car");
    }
}
