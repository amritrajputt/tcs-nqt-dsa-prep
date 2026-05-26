package arraymanipulation;

public class DutchNationalFlag {
    public static int[] dutchNationalFlag(int[] arr) {

        int low = 0, mid = 0, n = arr.length, high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } 

            else if (arr[mid] == 1) {
                mid++;
            } 
            
            else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

