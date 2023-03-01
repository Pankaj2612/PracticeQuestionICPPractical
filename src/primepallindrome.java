// A palindromic prime is a prime number and also palindromic.
// For example, 131 is a prime and also a palindromic prime, as are 313 and 757. Write a java program
// using methods (isPrime() and isPalindromic()) to display the first 100 palindromic prime numbers.
// public static boolean isPrime(int n)
// //Returns true is n is prime else returns false
// public static boolean isPalindromic(int n)
// //Returns true if n is palindromic number else returns false
// Display 10 numbers per line, separated by exactly one space, as follow:
// 2 3 5 7 11 101 131 151 181 191
// 313 353 373 383 727 757 787 797 919 929

public class primepallindrome {

  public static boolean isPrime(int n) {
    boolean flag1 = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) flag1 = false;
    }
    return flag1;
  }

  public static boolean isPalindromic(int n) {
    boolean flag2 = false;
    int revnum = 0;
    int oldn = n;
    while (n != 0) {
      int d = n%10;
      revnum = revnum * 10 + d;
      n = n/10;
    }
    if (oldn == revnum){ 
        flag2 = true;
    }
    return flag2;
  }

  public static void main(String[] args) 
  {
    int i = 1;
    int count = 0;
    while(count!=100){
        if(isPrime(i)&& isPalindromic(i)){
            count++;
            System.out.print(i+" ");
            if(count%10==0)
            System.out.println();
            
        }
        i++;
    } 
  }
}
