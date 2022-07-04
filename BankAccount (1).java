
package com.northern.bankaccount.bank.account;


public class BankAccount {
    
    private String accountName;
    private String accountNo;
    double balance;

    public BankAccount(String accountName, String accountNo, double balance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    
    public void deposite(double ammount){
        balance+=ammount;
        System.out.println("Deposite Successfuly "
                +ammount+" BDT.");
    }
    
    public void widthdraw(double ammount){
        balance -= ammount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
