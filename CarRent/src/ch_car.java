
import java.util.Date;
import java.util.Scanner;

class ch_car extends motor  {

public void greeting(){
    System.out.println("-------------1.Motorcycle------------");
    
}

public void brandMotor(){
    this.greeting();
    Scanner input = new Scanner(System.in);
    int w;
    int num;
    int price = 0;
    int choice;
    int total = 0;
    int day ;
    
    
    System.out.println("1. Fino 115 cc.\t150 THB.");
    System.out.println("2. Fino 125 cc.\t160 THB.");
    System.out.println("3. Gt 125 cc.\t160 THB.");
    System.out.println("4. Filano \t150 THB");
    System.out.println("5. Click 125i\t160 THB.");
    System.out.println("6. Zoomer-x \t160 THB.");
    System.out.println("Press 0 to exit...");
    do{
        System.out.print("Please select your choice : ");
        choice = input.nextInt();
        total = total + getPrice(choice,total);   
    }while(choice != 0);
    System.out.println();
    System.out.println("====Date of Your Rent Motorcycle====");
    setTimerent();
    System.out.print("How many day for rent? : ");
    day =input.nextInt();
    System.out.println("Total for rent is :" + (day*total/2)+"THB.");
    System.out.println("THANK YOU FOR USING THE SERVICE");
    System.out.println("====================================="); 
}

public void greeting1(){
    System.out.println("-----------2.Car------------");
    
}

public void brandCar(){
    this.greeting1();
    Scanner input = new Scanner(System.in);
    int w;
    int num;
    int price1 = 0;
    int choice1;
    int total1 = 0;
    int day1;
   
    
   
    System.out.println("1. Brio ");
    System.out.println("2. Yaris");
    System.out.println("3. Suzuki Swift");
    System.out.println("4. Vios ");
    System.out.println("5.Jazz");
    System.out.println("Press 0 to exit");
    do{
        System.out.print("Please select your choice : ");
        choice1 = input.nextInt();
        total1 = total1 + getPrice1(choice1,total1);   
    }while(choice1 != 0);
    System.out.println();
    System.out.println("====Date of Your Rent Car====");
    setTimerent();
    System.out.print("How many day for rent? : ");
    day1 =input.nextInt();
    System.out.println("total is :" + (day1*total1/2));
    
   
    
}

    public void setTimerent(){
        Date currentDate = new Date();
        System.out.println(currentDate);   
    }
    public void setTimeturn(){
        
    }

    

   
}

    


   