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
public class ElectricCar extends Car implements Transport {
    private  int kilowattHours;

   

    public ElectricCar(int kilowattHours, String make, String model, int modelYear, int maxSpeed) {
        super(make, model, modelYear, maxSpeed);
        setKilowattHours(kilowattHours);
    }

    public int getKilowattHours() {
        return kilowattHours;
    }

    public void setKilowattHours(int kilowattHours) {
       if(kilowattHours >= 10 && kilowattHours <= 400)
         this.kilowattHours = kilowattHours;
       else 
           throw new IllegalArgumentException("Kilowatt Hours must be between 10 and 400 "); 
    }

    @Override
    public String poweredBy() {
        return "electric motor";
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed(); 
    }

    @Override
    public void setModelYear(int modelYear) {
        super.setModelYear(modelYear); 
    }

    @Override
    public int getModelYear() {
        return super.getModelYear(); 
    }

    @Override
    public void setModel(String model) {
        super.setModel(model); 
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setMake(String make) {
        super.setMake(make); 
    }

    @Override
    public String getMake() {
        return super.getMake(); 
    }

   

    
    
   
   
    
}
