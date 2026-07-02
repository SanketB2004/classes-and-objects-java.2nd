package This_Static_Keyword;

public class car02_Sy {
    


    // instance Variable 


    int  noOfwheels ; // instance Variable 

    String color; // instance Variable 

    float maxSpeeed; // instance Variable 

    float currentFuelInLiters; // instance Variable 

    int noOFseets; // instance Variable 


    // instance Methods 
      public car02_Sy start(){
       if (currentFuelInLiters == 0){
            System.out.println("Car is out of Fuel , can not start");
        }else if(currentFuelInLiters<= 5){
            System.out.println("Car is Reserved Mood refuel");
        }else{
         System.out.println("Car is started bruuu bruu bruuu ");
         
        }
        return this;
}

    public void drive(){  // instance Methods

            currentFuelInLiters--;
       
         System.out.println("Car is drawing");
         
        }

        
    

    public void addFuel(float currentFuelInLiters){  // instance Methods

        this.currentFuelInLiters += currentFuelInLiters ; // use this add my instance variable not method variable 
        // this used to help doubble name 

    }

    public float getcurrentfuleLevel(){  // instance Methods

        return currentFuelInLiters;
    }





    
}
    

