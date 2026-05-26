public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int maxArea = 0;
        while (i < j) {
            // width calculate kr rhe hai kitne dur chaudai hai containers ki bich me
            int width = j - i;
            // kyunki hme choti wall chahiye kyunki bdi lenge to chote side se water
            // overflow krega so
            // multiply kr dege width*min(height[left],height[right])
            int area = width * Math.min(height[i], height[j]);
            maxArea = Math.max(area, maxArea);
            /*
             * agar left wall choti hai to i++
             * kyunki width to waise bhi kam hogi,
             * area badhane ka chance tabhi hai jab minimum height badhe,
             * aur minimum ko badhane ke liye shorter wall ko move krna padega
             */
            if (height[i] < height[j]) {
                i++;
            } else {
                // viceversa of if condition
                j--;
            }
        }
        return maxArea;
    }
}
