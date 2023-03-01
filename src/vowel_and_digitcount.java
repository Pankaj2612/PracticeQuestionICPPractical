import java.util.Scanner;

// Write a java method called vowelcount and digitcount which accepts a string as input and returns the
// number of vowels and digits in it. The method header is given below:
// // Returns the number of vowels in the String.
// public static int vowelcount(String str)
// Example: vowelcount(“soAIter45”), returns 4
// // Returns the number of vowels in the String.
// public static int digitcount(String str)
// For example: digitcount ("soAIter45”) returns 2.
// Sample Run:
// Enter the String: soAIter45
// Number of Vowels Present in given String : 4
// Number of digits present in given String: 2

public class vowel_and_digitcount {

  public static int vowelcount(String str) {
    String vowel = "aAiIOouUEe";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < vowel.length(); j++) {
        if (str.charAt(i) == vowel.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }

  public static int digitcount(String str) {
    String no = "0123456789";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < no.length(); j++) {
        if (str.charAt(i) == no.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    String str = sc.nextLine();

    System.out.println(
      "Number of Vowels Present in given String : " + vowelcount(str)
    );
    System.out.println(
      "Number of digits Present in given String : " + digitcount(str)
    );
  }
}
