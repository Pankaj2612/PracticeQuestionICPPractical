import java.util.Scanner;

// Set-C
// Q1) Input an array and update it by deleting all the duplicate elements
// Or
// Q1) Write a java program to print the nth prime number (input n from the user)

// Q2) Input a string from the user and print the number of vowels and consonants in it

public class Set_A_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int temp = 0;
    for(int i = 0 ; i < arr.length;i++){   

        for (int j = 1; j < arr.length-i; j++) {
            if(arr[j-1] > arr[j]){
                temp =   arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            
        }
        

      }

    int j = 0;  
        for (int i=0; i < arr.length-1; i++){  
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            
            }  
        }  
        arr[j++] = arr[arr.length-1];
        //System.out.println(j);
        
        for (int i=0; i<j; i++)  
           System.out.print(arr[i]+" ");  

  }
}