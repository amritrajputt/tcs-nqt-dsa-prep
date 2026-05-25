// Find all triplets in the array that sum to zero.  
// `Input: [-1,0,1,2,-1,-4]` → `Output: [[-1,-1,2],[-1,0,1]]`

import java.util.Scanner;

public class threesum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        System.out.print("enter target no: ");
        int target = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
