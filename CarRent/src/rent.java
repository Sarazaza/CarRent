import java.util.Scanner;
 class rent extends car {
     
     rent(){
//         super();
     }
   String l="n";
   int loop1;
   private String name;
   private String Surname;
   private int Number;
   private int Id;
    Scanner ac3 =new Scanner(System.in);
    
    public void printfor() {
     System.out.println("================LOGIN=================");
       
    }
    
    public void login(){
     String name;
     Scanner ac =new Scanner(System.in);
     System.out.print("Enter Your name : ");
     name= ac.nextLine();
     
     String Surname;
     Scanner ac1 =new Scanner(System.in);
     System.out.print("Enter Your Surname : ");
     Surname= ac.nextLine();
     
     int Number;
     Scanner ac2 =new Scanner(System.in);
     System.out.print("Your NumberPhone (Thailand):");
     Number = ac.nextInt();
     
     System.out.print("Your Id_card Number:(13) : ");
     Id= ac3.nextInt();
      
     int sell;  
     do{
         System.out.println("=====================================");
         System.out.println("What do you want a car for rent?");
         System.out.println("1.Motorcycle");
         System.out.println("2.Car");
         System.out.print("Please choose :");
         sell =ac.nextInt();
        
         ch_car b =new ch_car();
         
         if (sell==1){
         b.brandMotor();
        
        
        
     }else if(sell==2){
         b.brandCar();
   
     }
    
    }while ( loop1== 1||loop1==2) ; 
         
            
             
     }

 
   public void setName (String n){
         name =n;    
     }
    public int getName(){
        return Id;
    }
    
    
    public void setSurname(String s){
         Surname =s;    
     }
    public String getId(){
        return Surname;
    }
    
    
    public void setNumber (int m){
         Number =m;    
     }
    public int getNumber(){
        return Number;
    }
    
    
    public void setId (int a){
         Id =a;    
     }
    
}
    


