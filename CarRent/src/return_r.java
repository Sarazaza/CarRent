
import java.util.Date;
import java.util.Scanner;

public class return_r extends late_ret {
    public  void rere(){
       
        
//        int id1;
//        Scanner ac1 =new Scanner(System.in);
//        System.out.print("Your ID Card Number:");
//        id1 = ac1.nextInt();
//        
//        int id2;
//        Scanner ac2 =new Scanner(System.in);
//        System.out.println("==================================================");
//        System.out.print("Your ID Code number:");
//        //System.out.println("==================================================");
//        id2 = ac2.nextInt();
        
        int loop = 1; int no;
        do{ 
        System.out.println("==================================================");
        System.out.print("คืนรถช้ากว่าวันไหม?:");
        System.out.println("[1]Yes / [2]No");
        System.out.println("======================Choose======================");
        System.out.print("Enter:");
        Scanner a3 = new Scanner(System.in);
        no = a3.nextInt();
        
        }while(no != 1 && no != 2);
        
        if(no==1){
                late_ret t = new late_ret();
                t.late_ret();             
        }
        
        else if(no==2){
          System.out.println("*********Thankyou********** !!!");  
        }
    }
}

    

