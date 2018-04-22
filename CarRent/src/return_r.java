
import java.util.Date;
import java.util.Scanner;

public class return_r extends late_ret {
    public  void rere(){
        
        
        int loop = 1; int no;
        do{ 
              Date currentDate = new Date();
        System.out.println(currentDate);
        Date epoch = new Date(2018, 4, 24);
        Date today = new Date(2018, 4, 22);
        
        long diff = today.getTime() - epoch.getTime();
		System.out.println("เกินกำหนดคืนรถ " + (diff / (1000*60*60*24)) + " วัน"); 
                
        System.out.println("=====================================");
        System.out.print("คืนรถช้ากว่าวันไหม?:");
        System.out.println("[1]Yes / [2]No");
        System.out.println("===============Choose================");
        System.out.print("Enter:");
        Scanner a3 = new Scanner(System.in);
        no = a3.nextInt();
        
        }while(no != 1 && no != 2);
        
        if(no==1){  
                late_ret t = new late_ret();
                t.late_ret();             
        }
        
        else if(no==2){
          System.out.println("******************Thankyou****************** !!!");  
        }
    }
}

    

