package This_Static_Keyword;


public class car {


    public static void main(String[] args) {

        car02_Sy mycar = new car02_Sy(); // object declering  , mycar is reference variable

        // Using Objects 

        // mycar.drive();

        // System.out.println(mycar.getcurrentfuleLevel());

        // mycar.addFuel(100);

        // System.out.println(mycar.getcurrentfuleLevel());

        //  mycar.drive();
        //  System.out.println(mycar.getcurrentfuleLevel());

   car02_Sy Swift = new car02_Sy();
     
     
   Swift.start();
   Swift.addFuel(6);

   Swift.drive();

    //car02_Sy  started = Swift.start(); // this  keyword used to this step run 
    
   Swift.start().drive();//method chaining useful this keyword 


   Swift.addFuel(500);// useful for name conflict 
   
System.out.println(Swift.getcurrentfuleLevel());




    
}
    
}
