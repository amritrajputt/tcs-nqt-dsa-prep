public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        /* remember : j move krega i fix rhega j ko agar 0 mila to kuch nhi krega aage bdh jayega 
        but agar non zero mila j ko to wo swap ho jayega i se aur i and j dono aage bdh jayenge */ 
        int i = 0, j = 0;
        while (j < n) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
