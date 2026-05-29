package slidingwindow;

// ### Q13. Count Distinct Elements in Every Window of Size K
// Print count of distinct elements in each window.  
// `Input: arr=[1,2,1,3,4,2,3], K=4` → `Output: [3,4,4,3]`
import java.util.*;

class DistinctElementsizeK {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int low = 0;
        if (k > arr.length) {
            return new ArrayList<>();
        }
        for(int high=0;high<arr.length;high++){
            map.put(arr[high], map.getOrDefault(arr[high], 0) + 1);
            
            if(high-low+1 == k){
              
                res.add(map.size());
                map.put(arr[low], map.get(arr[low]) - 1);

                if (map.get(arr[low]) == 0) {
                    map.remove(arr[low]);
                }

                low++;
            }
        }
        return res;
    }
}