/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package em.assignment7;

/**
 *
 * @author Emmanuel
 */
public class Planes extends Vehicle {
     public boolean isFlying;
    public Planes( boolean fly, String make, String model, String year, String weight){
        super(make, model, year, weight);
        isFlying = fly;
    }
       //the Cars subclass adds method
    public void Flying(boolean newValue){
        isFlying = newValue;
        TripsSinceMaintenance +=1;
        if (TripsSinceMaintenance >= 100){
            System.out.println(NeedsMaintenance = true);
        }
    }
    public void Landing(boolean newValue){
        isFlying = newValue;
        newValue = false;
    }
}
