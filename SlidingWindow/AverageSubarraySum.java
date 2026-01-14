package SlidingWindow;

public class AverageSubarraySum {
    public static double findMaxAverage(int[] nums, int k) {
        int windowSt = 0;
        int windowEnd = 0;
        double windowSum = 0;
        double ans = Integer.MIN_VALUE;

        for(windowEnd = 0; windowEnd < nums.length; windowEnd++){
            windowSum += nums[windowEnd];

            if(windowEnd >= k-1){
                ans = Math.max(ans,windowSum/k);
                windowSum -= nums[windowSt++];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,-1,3,-5,-6,20,-7};
        System.out.println(findMaxAverage(arr, 4));
    }
}
