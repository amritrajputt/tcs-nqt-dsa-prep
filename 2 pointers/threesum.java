import java.util.*;
class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // i ko fix loop me kr dete hai i ki last 3rd tk hi ja skta hai
        for (int i = 0; i <= nums.length - 3; i++) {
            // agar current ele of i same hai prev ele k to skip krte jaao
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    // agar current ele of j same hai prev ele k to skip krte jaao
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    // agar current ele of k same hai prev ele k to skip krte jaao
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        return result;
    }
}