
package em.assignment7;


public class Vehicle {
    // the vehicle has four fields including needsMaintenance, TripsSinceMaintenance
      String make;
      String model;
      String year;
      String weight;
      boolean NeedsMaintenance;
      int TripsSinceMaintenance;
      
      //vehicle has one constructor
    public Vehicle(String make, String model, String year, String weight){
         this.make = make;
         this.model = model;
         this.year = year;
         this.weight= weight;
         this.NeedsMaintenance = false;
         this.TripsSinceMaintenance = 0;   
     }
    
    public void repair(){
        TripsSinceMaintenance = 0;
        NeedsMaintenance = false;
        
    }
    
    //the vehicle has four methods
    public void setMake(String newValue){
        make = newValue;
    }
    public void setModel(String newValue){
        model = newValue;
    }
    public void setYear(String newValue){
        year = newValue;
    }
    public void setWeight(String newValue){
        weight = newValue;
    }
    public void setNeedsMaintenance(boolean newValue){
        NeedsMaintenance = newValue;
    }
    public void TripsSinceMaintenance(int newValue){
        TripsSinceMaintenance = newValue;
    }

    public void display(){
        System.out.println(make);
        System.out.println("\tModel is: " + model);
        System.out.println("\tYear is " + year);
        System.out.println("\tWeight is " + weight);
        System.out.println("\tNeeds a maintenance " +NeedsMaintenance);
        System.out.println("\tAll the trips since maintenance" + TripsSinceMaintenance);
    }

   
    
}
