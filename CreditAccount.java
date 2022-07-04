
package com.northern.bankaccount.bank.account;


public class CreditAccount extends BankAccount{
    
        private double creditLimit;

    public CreditAccount(String accountName, String accountNo,
            double balance,double creditLimit) {
        super(accountName, accountNo, balance);
        this.creditLimit= creditLimit;
        
        
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    
        @Override
        public void widthdraw(double ammount) {
        if (ammount<=creditLimit) {
            
            balance=((balance-ammount)-84);
            
        }else{
            System.out.println("Operation Failed! Your cradit limit is "
                    +this.creditLimit);
        }

    }
    
    
        
        
    
    
    
}
