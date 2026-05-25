// ### Q5. Squaring Sorted Array
// Given a sorted array (may have negatives), return sorted array of squares.  
// `Input: [-4,-1,0,3,10]` → `Output: [0,1,9,16,100]`

import java.util.ArrayList;
import java.util.Collections;

public class squareofsortedarray {
    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int res[] = squareOfSorted(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }

    private static int[] squareOfSorted(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        for (int i = 0; i < positive.size(); i++) {
            int sq = positive.get(i) *positive.get(i);
            positive.set(i,sq);
        }
        for (int i = 0; i < negative.size(); i++) {
            int sq = negative.get(i) *negative.get(i);
            negative.set(i,sq);
        }
         Collections.reverse(negative);
        int[] ans =  mergeTwoSortedArray(positive, negative);
        return ans;
    }

    private static int[]  mergeTwoSortedArray(ArrayList<Integer> positive, ArrayList<Integer> negative) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = positive.size();
        int n = negative.size();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (positive.get(i) < negative.get(j)) {
                result.add(positive.get(i));
                i++;
            } else {
                result.add(negative.get(j));
                j++;
            }
        }
        while (i < m) {
            result.add(positive.get(i));
            i++;
        }
        while (j < n) {
            result.add(negative.get(j));
            j++;
        }
        int len = result.size();
        int ans[] = new int[len];
        for (int ind = 0; ind < len; ind++) {
            ans[ind] = result.get(ind);
        }
        return ans;
    }
}
