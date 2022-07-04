
package com.northern.bankaccount.bank.account;


public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountName, String accountNo, double balance) {
        super(accountName, accountNo, balance);
    }
    
    @Override
        public void widthdraw(double ammount){
        
        if(ammount<=getBalance()){
        
                    super.widthdraw(ammount);
        
        
        }
        else{
        
                    System.out.println("You have not enough balance");
        }
        
        }

    
}
