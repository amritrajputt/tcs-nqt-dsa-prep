package slidingwindow;

public class minSumSubArrSizeK {
    public static int minSubarraySum(int[] arr, int k) {
        int low = 0, sum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int high = 0; high < arr.length; high++) {
            sum += arr[high];

            if (high - low + 1 == k) {
                minSum = Math.min(minSum, sum);

                sum -= arr[low];
                low++;
            }
        }

        return minSum;
    }
}