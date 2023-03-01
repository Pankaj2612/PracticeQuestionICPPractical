import java.util.Scanner;

public class oilmustarbottlelitre {

    public static void main(String[] args) {
        

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of X and Y  : ");
            int  x = sc.nextInt();
            int y = sc.nextInt();
    
     
    
                int bl = y/x;
                int bl1 = y%x;
                System.out.println("Number of " + x + "liter bottles : " + bl);
                System.out.println("Number of 1 liter bottles : "+ bl1);
    }
    
}
