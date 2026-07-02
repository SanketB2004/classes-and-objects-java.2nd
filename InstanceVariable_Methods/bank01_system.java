/**
 * bank01_system
 */
public class bank01_system {

    //Instance Variable 
    String acountHolder;
    
    double balance;

    // instance methods 

    void deposit(int amount){
      
        balance   += amount ;

    }

    void withdraw( int amount){

        balance -= amount ;

    }

    int checkbalnce(int amount){

     int a = amount ; 

     return a;
    }
}