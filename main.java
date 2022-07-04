
package com.northernbank.management;

import com.northernbank.management.bank.CreditAccount;
import com.northernbank.management.bank.CurrentAccount;
import com.northernbank.management.bank.SavingAccount;
import com.northernbank.management.bank.SoriahAccount;
import com.northernbank.management.bank.StudentAccount;


public class main {

  
    public static void main(String[] args) {
        
        
 //**************SavingAccount***********************************//        
         SavingAccount sa1= new SavingAccount("Polash", "738434738", 2000,1);
         
        System.out.println("This is  Saving Account informetion");
        
        System.out.println("Blance:"+sa1.getBalance());
        sa1.widthdraw(1700);
        System.out.println("Blance:"+sa1.getBalance());
        sa1.widthdraw(1200);
        System.out.println("Blance:"+sa1.getBalance());
        System.out.println("");

//*********************CurrentAccount***************************//

CurrentAccount cur1=new CurrentAccount ("polash","545454",2000);

        System.out.println("This is  CurrentAccount informetion");

        System.out.println("Blance:"+cur1.getBalance());
        cur1.widthdraw(1900);
        System.out.println("Blance:"+cur1.getBalance());
        System.out.println("");
        
//*******************SoriahAccount*******************************//

SoriahAccount sor1=new SoriahAccount
                    ("polash","121212",2000,1);

        System.out.println("This is SoriahAccount informetion");

        System.out.println("Blance:"+sor1.getBalance());
        sor1.widthdraw(1200);
        System.out.println("Blance:"+sor1.getBalance());
        System.out.println("");

//*****************StudentAccount*******************************//

StudentAccount stu1=new StudentAccount("polash","4544564",2000,1);

        System.out.println("This is  StudentAccount informetion");

     
        System.out.println("Blance:"+stu1.getBalance());
        stu1.widthdraw(1200);
        System.out.println("Blance:"+stu1.getBalance());
        System.out.println("");

//******************CreditAccount******************************//

CreditAccount crd1=new CreditAccount("polash","11111",2000,1000);

        System.out.println("This is CreditAccount informetion");

        
        System.out.println("Blance:"+crd1.getBalance());
        crd1.widthdraw(1200);
        System.out.println("Blance:"+crd1.getBalance());
        crd1.widthdraw(800);
        System.out.println("Blance:"+crd1.getBalance());
        
        

        
    }       
        
        
      
        
        
        
    
}
