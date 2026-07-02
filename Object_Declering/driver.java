package Object_Declering;

import InstanceVariable_Methods.car02_system;

public class driver {

    public static void main(String[] args) {

        car02_system mycar = new car02_system(); // object declering  , mycar is reference variable

        // Using Objects 

        mycar.drive();

        System.out.println(mycar.getcurrentfuleLevel());

        mycar.addFuel(100);

        System.out.println(mycar.getcurrentfuleLevel());

         mycar.drive();
         System.out.println(mycar.getcurrentfuleLevel());





    }
}