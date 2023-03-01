public class cmmn_prime_div_of_two_no {

  public static boolean isprime(int m) {
    boolean flag = true;
    for (int i = 2; i < m; i++) {
      if (m % i == 0) flag = false;
    }
    return flag;
  }

  public static int commonprimediv(int x, int y) {
    for (int i = 2; i <= x / 2; i++) {
      if (x % i == 0) {
        if (isprime(i)) 
        System.out.println(i);
      }
    }
    for (int i = 2; i <= y / 2; i++) {
      if (y % i == 0) {
        if (isprime(i)) 
        System.out.println(i);
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    commonprimediv(27, 27);
  }
}
