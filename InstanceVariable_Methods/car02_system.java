
package InstanceVariable_Methods;
/**
 * car02_system
 */
public class car02_system {

    // instance Variable 


    int  noOfwheels ; // instance Variable 

    String color; // instance Variable 

    float maxSpeeed; // instance Variable 

    float currentFuelInLiters; // instance Variable 

    int noOFseets; // instance Variable 


    // instance Methods 


    public void drive(){  // instance Methods

        if (currentFuelInLiters <= 0){
            System.out.println("Car is out of Fuel");
        }else if(currentFuelInLiters<= 5){
            System.out.println("Car is Reserved Mood");
        }else{
         System.out.println("Car is drawing");
         currentFuelInLiters--;
        }

        
    }

    public void addFuel(float fuel){  // instance Methods

        currentFuelInLiters += fuel ;

    }

    public float getcurrentfuleLevel(){  // instance Methods

        return currentFuelInLiters;
    }





    
}