/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.time.LocalDate;

/**
 *
 * @author Jacob Rodgers 200320013
 */
public class PowerBoat extends Boat implements Transport {

    private int horsePower; 
    private int maxSpeed; 

    public PowerBoat(int horsePower, int maxSpeed, int length,  int modelYear, String make, String model) {
        super(length, maxSpeed, modelYear, make, model);
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }
    
    
    

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
      if(horsePower > 2 && horsePower < 2000)
        this.horsePower = horsePower;
      else 
          throw new IllegalArgumentException("horsePower must be between 2 - 2000");
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 1 && maxSpeed < 200) 
             this.maxSpeed = maxSpeed;
        else
            throw new IllegalArgumentException("max speed must be between 1- 200");
                
    }


    @Override
    public String poweredBy() {
        return "gas or diesel engine";
    }

   
  
  
    

   
    
    

    
}
