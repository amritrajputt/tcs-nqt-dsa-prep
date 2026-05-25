// ### Q2. Pair with Given Sum in Sorted Array
// Given a sorted array and target T, find if a pair exists with sum = T.  
// `Input: arr=[1,3,5,7,9], T=12` → `Output: Yes (3,9)`

import java.util.Scanner;

public class twosum {

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
        int ans[] = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return new int[] { arr[i], arr[j] };
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }
}
