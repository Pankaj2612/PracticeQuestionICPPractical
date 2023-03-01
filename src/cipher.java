import java.util.Scanner;

public class cipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message : ");
        String msg = sc.nextLine();
        
        String cipmsg = "";
        for(int i = 0 ; i<msg.length();i++){

            for(int j = 0; i>=j;j++){

                cipmsg += msg.charAt(i);

            }

        }
        System.out.println("Ciphertext is : "+cipmsg);



    }
    
}
