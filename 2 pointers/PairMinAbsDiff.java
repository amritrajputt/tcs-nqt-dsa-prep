import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairMinAbsDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i - 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                res.clear();
                res.add(new ArrayList(Arrays.asList(arr[i - 1], arr[i])));
            } else if (diff == minDiff) {
                res.add(new ArrayList(Arrays.asList(arr[i - 1], arr[i])));
            }
        }
        return res;
}
}
