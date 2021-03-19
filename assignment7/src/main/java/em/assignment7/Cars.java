
package em.assignment7;

public class Cars extends Vehicle {
    //the cars have a method called drive
    public boolean isDriving;
   
    public Cars(boolean drive, String make, String model, String year, String weight) {
        super(make, model, year, weight);
        isDriving = drive;
    }
    
    //the Cars subclass adds method
    public void Drive(boolean newValue){
        isDriving = newValue;
        TripsSinceMaintenance +=1;
        if (TripsSinceMaintenance >= 100){
            System.out.println(NeedsMaintenance = true);
        }
    }
    public void Stop(boolean newValue){
        isDriving = newValue;
        newValue = false;
    }


}
