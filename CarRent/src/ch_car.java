

import java.util.Scanner;

class ch_car extends motor {

public void greeting(){
    System.out.println("---------1.Motorcycle---------");
    
}

public void brand(){
    this.greeting();
    Scanner input = new Scanner(System.in);
    int w;
    int num;
    int price = 0;
    int choice;
    int total = 0;
    int Atotal = 0;

    System.out.println("1. Fino 115 cc.");
    System.out.println("2. Fino 125 cc.");
    System.out.println("3. Gt 125 cc.");
    System.out.println("4. Filano ");
    System.out.println("5. Click 125i");
    System.out.println("6. Zoomer-x ");
    System.out.println("Press 0 to exit");
    do{
        System.out.print("Please select your choice : ");
        choice = input.nextInt();
        Atotal = total + getPrice(choice,total);   
    }while(choice != 0);
    
    System.out.print("total is :" + Atotal);
    
   
}
public void greeting1(){
      System.out.print("1.Car");
      
    }
public void brand1(){
    this.greeting1();
    
}
}

  
    