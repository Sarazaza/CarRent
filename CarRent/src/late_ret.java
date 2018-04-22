import java.util.Scanner;

public class late_ret {
    public int howday;
    public int num;
    public int ToltalRate ;
    
    Scanner a =new Scanner(System.in);
//    private String TotalRate;
    
    int late_ret(){
    System.out.print("How many day of your late :");
    howday =a.nextInt();
    
    System.out.print("Please choose [1]Motorcycle or [2]Car :");
    num =a.nextInt();
    
    
    switch(num ){
        case 1:  
        
        System.out.print("");
        ToltalRate = howday*80;
        System.out.print("Toltal "+ToltalRate);
         break;
        
    
        case 2:
        System.out.print("");    
        ToltalRate = howday*500;
        System.out.print("Toltal Late of Your Car is :"+ToltalRate);
        break;
    }
        return 0;
    
    
}
//    int printt(){
//    System.out.print
//    }("Late"+this.TotalRate);
//        return 0;
}
 
    

