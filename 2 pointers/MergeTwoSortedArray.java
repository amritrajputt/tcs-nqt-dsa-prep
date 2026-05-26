import java.util.ArrayList;

public class MergeTwoSortedArray {
    private static int[] mergeTwoSortedArray(ArrayList<Integer> positive, ArrayList<Integer> negative) {
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
