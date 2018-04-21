

import java.util.Scanner;
public class Main_car {

  
    public static void main(String[] args) {
     System.out.println("========WELCOME========");
     System.out.println("====PK Car For Rent====");
     int loop = 0 ;
    int a;
    rent r = new rent();

    a =r.getId();
    
   
    Scanner input = new Scanner(System.in);
     System.out.println("######Select a car rental item.#######");
     System.out.println("Choose 1. rent a car");
     System.out.println("Choose 2.return the car");
     System.out.println("***************************************");
     int Choose;
     Scanner ac4 =new Scanner(System.in);
     System.out.print("Choose:");
     Choose= ac4.nextInt();
      do{
     if (Choose==1){
         r.login();
         
    }else if(Choose==2){
         
         System.out.println("id card is"+r.getId());
          // o.return();
        }
     
      }while (loop == 1||loop==2) ; 
     
                          }
 
    
    
    }
     
    
    

