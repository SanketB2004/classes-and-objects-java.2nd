 package Object_Declering;

import InstanceVariable_Methods.bank01_system;

class bank01 {

public static void main(String[] args) {
    
    bank01_system acc1 = new bank01_system();

acc1.accountHolder = "Sanket";
acc1.balance = 5000;

acc1.deposit(2000);

acc1.checkBalance();

acc1.withdraw(1000);

acc1.checkBalance();
}
    
}