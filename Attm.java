import java.util.*;
public class Attm {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ATM process");
        System.out.println("enter your card");
        System.out.println("select any language");
        System.out.println("1.english");
        System.out.println("2.Hindi");


        int ch=sc.nextInt();
        switch(ch){
           case 1:
         System.out.println("English");
          break;
            case 2:
           System.out.println("Hindi");
        break;
       }

        System.out.println("select any one option");
        

       System.out.println("1=Saving Account");
       System.out.println("2=loan Account");
       System.out.println("3=fixed deposit Account");
       System.out.println("4=credit Account");
//p=pin
//a =amount
//d=deposit
//w=withdrawl
//c=current balance
//r =recipt

       int w;
       int a=20000;
       int pin=223344;
       int n,d,p,r;

int cha=sc.nextInt();
       switch(ch){
        case 1:
        System.out.println("Saving Account");
        System.out.println("choose any one option");
        System.out.println("1. Withdrawl");
    System.out.println("2. Deposit");
    System.out.println("3. Pin change");
    System.out.println("4. check balane");
    
    w=sc.nextInt();
    switch(w){
        case 1:
    System.out.println("enter amount you have to withdrawl");
    w=sc.nextInt();
    System.out.println("enter your pin");
    p=sc.nextInt();
    if(p==pin){
        System.out.println("take your amount");
        int c=a-w;
        System.out.println("previous balance="+a);
        System.out.println("amount left is="+c);
        System.out.println("***********THANK YOU************");
    }else{
        System.out.println("your pin is wrong ");
        System.out.println("write correct pin");
    }
    break;
     
    case 2:
    System.out.println("enter oyur amount you have to deposit");
    d=sc.nextInt();
    System.out.println("enter your pin");
    p=sc.nextInt();
    if(p==pin){
        System.out.println( "Deposits successfully");
    int c=d+a;
    System.out.println("your previous balance is ="+a);
    System.out.println("current Balance="+c);
    System.out.println("**THANK YOU**");
    }else{
        System.out.println("enter correct pin");
     }
     break;
    case 3:
    System.out.println("enter your old pin");
    p=sc.nextInt();
    
    System.out.println("enter your new pin");
    n=sc.nextInt();
    System.out.println("your pin change successfuly");
    System.out.println("====THANK YOU=====");
    break;
    case 4:
    System.out.println("enter your pin");
    p=sc.nextInt();
    if(p==pin){
        System.out.println("your balance is="+a);
        System.out.println("thank you");
    }else{
        System.out.println("wrong pin");
        System.out.println("enetr correct pin");
    }
    break;
    
    }
    
    
        break;
  
  case 2:
  System.out.println("loan Account");
  System.out.println("enter your amount");
  
  break;

  case 3:
  System.out.println("Fixed deposit Account ");
  break;
  case 4:
  System.out.println("cred card Account");
  break; 
    }


    }
}
    

