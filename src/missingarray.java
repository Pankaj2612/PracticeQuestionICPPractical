import java.util.Scanner;

// Given an array nums containing N distinct numbers in the range [0, N], return the only number in the
// range that is missing from the array. Write a method to find the Missing number in the Array. The method
// header is given as: public static int MissingNumber(int[] nums)
// Note: There are no duplicates in the list.
// Sample Run:
// Enter the value of N : 9
// Enter array elements: 9 6 4 2 3 5 7 0 1
// The missing number is: 8
// Explanation: N = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing
// number in the range since it does not appear in nums.

public class missingarray {

    public static int MissingNumber(int[] nums) {
      
        int arrlen = nums.length;
        int sum = arrlen*(arrlen+1)/2; //sum of natural numbers

        int arraysum = 0;
        for (int i = 0; i < nums.length; i++) {
            
            arraysum += nums[i];
            
        }
        int missing = sum - arraysum;
        return missing;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int  n= sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");

        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The missing Number is : " + MissingNumber(arr));

    }
    
} 
