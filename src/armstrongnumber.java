// Write a java program with method isArmstrong() to display the first 100 armstrong numbers. Display 10
// numbers per line, separated by exactly one space.
// public static boolean isArmstrong(int n)
// //Returns true if n is an armstrong number else returns false
// Note: A number is thought of as an Armstrong number if the sum of its own digits raised to the power
// number of digits gives the number itself. For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong
// numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.


public class armstrongnumber {

    public static boolean isArmstrong(int n) {
    boolean p = false;
    String  num= String.valueOf(n);
    int len = num.length();
        int sum = 0;
        int oldn = n;
        while(n!=0){
            int d = n%10;
            sum += Math.pow(d, len);
            n = n/10;
        }
        if (sum == oldn)
            p =  true;

        return p;
    }
    public static void main(String[] args) {

        int i = 100;
        int count = 0;
        while(count!=100){

            if(isArmstrong(i)){
                System.out.print(i+" ");
                count++;
                if(count%10==0)
                    System.out.println();
            }
            i++;
        }
        // System.out.println(isArmstrong(153));
        
    }

    
}
