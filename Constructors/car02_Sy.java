package Constructors;

public class car02_Sy {
    


    // instance Variable 

    static int nooftotalCarSell; // use for car sold code bloks 
// Code Bolocks
    static{   // static ka karan yakadacha run honar pratyak car sell kelyaver 

      nooftotalCarSell = 0;
   System.out.println("I am in static block");
    }
{

    nooftotalCarSell++;
    System.out.println("I am in Init block"+ nooftotalCarSell++);
}// ha block jevha object new create hoil tevhacha run hoil sarkha nay yakda yakada cha pratyak car sathi
// defult constructor S
    int  noOfwheels ; // instance Variable 

    String color; // instance Variable use 

    // use for new instance variable to permatized contructor 

    String interiorColor;

    float maxSpeeed; // instance Variable 

    float currentFuelInLiters; // instance Variable 

    int noOFseets; // instance Variable 

     car02_Sy() {
        this("Premium Choice In Company"); // jer object make karatana ni color nay dhila ter ha color choise hoil yala constructor chaing asa mhantata tya sathi same don constructor create kele jatat kinvha multiple constructoe use kela jato
     // by defult contructor ahe ha yaat customer change karu shakato
    //pn by defult tyne object banavala ki ya value tyala janar 

        color = "Black"; 
        noOfwheels = 4;
        maxSpeeed = 150;
        currentFuelInLiters = 50;
        noOFseets = 5;
     }
    // paramterrized constructor 

    car02_Sy(String interiorColor) {

        this.interiorColor = interiorColor;
        currentFuelInLiters = 5;

    }

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

public float maxSpeedChange(int maxSpeeed) {
        return this.maxSpeeed += maxSpeeed;
    }


    

    
}
    

