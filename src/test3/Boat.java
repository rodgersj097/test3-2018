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
public abstract class Boat implements Transport{
  
    int length;
    private int maxSpeed, modelYear ;  
    private String make, model ;

    public Boat(int length, int maxSpeed, int modelYear, String make, String model) {
       
        setModelYear(modelYear);
        setLength(length);
        setMaxSpeed(maxSpeed);
        setMake(make);
        setModel(model);
    }
    

   

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
       if(length > 6 && length < 1550)
            this.length = length;
       else 
           throw new IllegalArgumentException("Length must be between 6 and 1550"); 
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     *
     * @param maxSpeed
     */
    public abstract void setMaxSpeed(int maxSpeed);

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty())
            throw new IllegalArgumentException("Make CAnnot be empty");
        else 
            this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
       if(model.isEmpty())
          throw new IllegalArgumentException("Model CAnnot be empty");
       else
          this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
       LocalDate futureYear = LocalDate.now().plusYears(1); 
       if(modelYear > 1400 && modelYear < futureYear.getYear())
         this.modelYear = modelYear;
       else 
        throw new IllegalArgumentException("Model Year must be between 1400 and " + futureYear);
    }
  
    
    
}
