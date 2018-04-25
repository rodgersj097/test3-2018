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
public class Car implements Transport {
    private String make, model; 
    private int modelYear, maxSpeed; 
    private String[] validMakes = {"Audi", "Toyota", "Ford"}; 
    
    public Car(String make, String model, int modelYear, int maxSpeed) {
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
        setMaxSpeed(maxSpeed);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
     for (String validMake : validMakes){
         if(validMake.equalsIgnoreCase(make)){
             this.make = make;
             return ;
     }
     }
         throw new IllegalArgumentException("Invalid Make. Must be Audi, Toyota or Ford");
     
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
       if(model.isEmpty())
           throw new IllegalArgumentException("Modle cannot be empty"); 
       else
           this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
      LocalDate futureYear = LocalDate.now().plusYears(1); 
     
        if(modelYear > 1900 && modelYear < futureYear.getYear())
            this.modelYear = modelYear;
        else 
            throw new IllegalArgumentException("Inalid Year, The year must be between 1900 and " + futureYear); 
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed >= 1 && maxSpeed <= 600)
            this.maxSpeed = maxSpeed;
        else
            throw new IllegalArgumentException("Max speed must be between 0-600");
    }

    @Override
    public String poweredBy() {
       return "gas or diesel engine"; 
    }
    
    
 
    
}
