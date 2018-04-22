
import java.util.Date;
import java.util.Scanner;

public class return_r extends late_ret {
    public  void rere(){
        
        
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

    

