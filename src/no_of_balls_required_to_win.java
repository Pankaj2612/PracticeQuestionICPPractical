import java.util.Scanner;

public class no_of_balls_required_to_win {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target set by PAK : ");
        int y = sc.nextInt();
        System.out.print("Enter the score of  IND : ");
        int  x = sc.nextInt();

 

            int balls = (y -x)/6;
            int p = (y-x)%6;
            System.out.println(p);
            int totalballs = balls + p;
            System.out.println("No of balls reuired to score 6 at each ball : " + balls);
            System.out.println("No of balls reuired to score 1 at each ball : " + p);
            System.out.println("Number of balls required: "+totalballs);

    }
}
