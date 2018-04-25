/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author Jacob Rodgers 200320013
 */
public class SailBoat extends Boat{
    private int numOfMasts, maxSpeed; 

    public SailBoat(int numOfMasts,  int length, int maxSpeed, int modelYear, String make, String model) {
        super(length, maxSpeed, modelYear, make, model);
        setNumOfMasts(numOfMasts);
        setMaxSpeed(maxSpeed);
    }

    public int getNumOfMasts() {
        return numOfMasts;
    }

    public void setNumOfMasts(int numOfMasts) {
          if(numOfMasts >= 1 && numOfMasts <= 5)
           this.numOfMasts = numOfMasts;
      else
          throw new IllegalArgumentException("Number of masts must be between 1- 5 "); 
         
     
    }


   

   

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
       if(maxSpeed > 1 && maxSpeed < 75)
        this.maxSpeed = maxSpeed;
       else 
         throw new IllegalArgumentException("Max speed must be between 1-75 "); 

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String poweredBy() {
     return "wind"; 
    }
    
    
    
}
