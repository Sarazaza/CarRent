

import java.util.Scanner;
 class rent extends car {
    
   int loop1;
   public String name;
   public String Surname;
   public int Number;
   private int Id;
    Scanner ac3 =new Scanner(System.in);
    
    public void login(){
     System.out.println("====LOGIN======");
     String name;
     Scanner ac =new Scanner(System.in);
     System.out.print("Your name :");
     name= ac.nextLine();
    String Surname;
    Scanner ac1 =new Scanner(System.in);
     System.out.print("Your Surname:");
     Surname= ac.nextLine();
     int Number;
     Scanner ac2 =new Scanner(System.in);
     System.out.print("Your NumberPhone (Thailand):");
     Number = ac.nextInt();
     System.out.print("Your Id_card Number:");
     Id= ac3.nextInt();
      
     int sel;  
     do{
         System.out.println("==================================");
         System.out.println("What do you want to car for rent?");
         System.out.println("1.Motorcycle");
         System.out.println("2.Car");
         System.out.print("Your choose :");
         sel =ac.nextInt();
        
         ch_car u =new ch_car();
        if (sel==1){
        u.brand();
       
         
        }
     
      }while ( loop1== 1||loop1==2) ; 
      
            
             
     }

 
   public void setId (int a){
         Id =a;
         
     }
    public int getId(){
        return Id;
    }
     
     
}
    


