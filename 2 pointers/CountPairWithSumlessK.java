public class CountPairWithSumlessK {
    public static int SumLessThanK(int[] arr,int k) {
        if(arr.length <= 1) return -1;
        int i = 0,j = arr.length-1,count=0;
        while(i<j){
            if(arr[i] + arr[j] < k){
                count += j-i;
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
    
}