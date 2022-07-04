
package com.northern.bankaccount.bank.account;


public class SoriahAccount extends BankAccount{
    
        private int year;


    public SoriahAccount(String accountName, String accountNo, double balance,int year) {
        super(accountName, accountNo, balance);
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    @Override
    public void widthdraw(double ammount){
        if (ammount<=getBalance()-500) {
            balance=((balance-((balance*2/100)*year))-ammount);

           
            }
        
        else{  
            
                System.out.println("You have not enough balance");

        }
    }
    
    
    
    
    
    
    
    
}
