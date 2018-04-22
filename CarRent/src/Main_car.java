
import java.util.Scanner;

public class Main_car {

    public static void main(String[] args) {
        System.out.println("===============WELCOME================");
        System.out.println("===========PK Car For Rent============");
        int loop = 0;
        int a;
        rent r = new rent();
        return_r o = new return_r();
      
//        a = r.getId();

        Scanner input = new Scanner(System.in);
        System.out.println("######Select a car rental item.#######");
        System.out.println("\tChoose 1.rent the car");
        System.out.println("\tChoose 2.return the car");
        System.out.println("======================================");
        
        int Choose;
        
        Scanner ac4 = new Scanner(System.in);
        System.out.print("Please Choose : ");
        Choose = ac4.nextInt();
        do {
           
            if (Choose == 1) {
                r.printfor();
                r.login();

            } else if (Choose == 2) {

                
                o.rere();

            }
           

        } while (loop == 1 || loop == 2);

    }

}
