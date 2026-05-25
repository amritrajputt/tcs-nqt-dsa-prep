// ### Q1. Remove Duplicates from Sorted Array
// Given a sorted array, remove duplicates in-place and return the new length.  
// `Input: [1,1,2,3,3,4]` → `Output: 4 → [1,2,3,4]`

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int len = removeDuplicate(arr);

        System.out.println("New length: " + len);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicate(int[] arr) {
        if(arr.length == 0) return 0;
        // phla element hmesha unique hi hoga so start count = 1 and traversal from 1
        int count = 1;
        int ind = 0; // abhi jha tk unique element hai wha tk ye pointer hai aaage aane wale iske
                     // aage aayenge hum hmesha arr[ind+1] pe unique element ko dalege
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[ind + 1] = arr[i];
                ind++;
                count++;
            } else
                continue;
        }
        return count;
    }

}