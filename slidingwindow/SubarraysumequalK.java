package slidingwindow;
// ### Q11. Maximum Sum Subarray of Size K

// Find max sum of any contiguous subarray of size K.  
// `Input: arr=[2,1,5,1,3,2], K=3` → `Output: 9`

public class SubarraysumequalK {
    public static int maxSubarrraySum(int[] arr, int k) {
        int low = 0, sum = 0, maxSum = Integer.MIN_VALUE, n = arr.length;
        for (int high = 0; high < n; high++) {
            // add krte rhenge jb tk k size window pura na ho jaye
            sum += arr[high];

            if(high-low+1 == k){ // jb k size ho jaye
                maxSum = Math.max(sum, maxSum); // compare kr lo
                sum -= arr[low];// left se 1 element subtract krke
                low++;//1 element forward move kr jaao
            }
        }
        return maxSum;
    }
}
