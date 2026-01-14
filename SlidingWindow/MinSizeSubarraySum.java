package SlidingWindow;

public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int windowSt = 0;
        int windowEnd = 0;
        int windowSum = 0;
        int ans = Integer.MAX_VALUE;

        for(windowEnd = 0; windowEnd <nums.length; windowEnd++){
            windowSum += nums[windowEnd];
            if(windowSum >= target){
                ans = Math.min(ans, (windowEnd - windowSt + 1));
                while(windowSum >= target){
                    windowSum -= nums[windowSt++];
                    if(windowSum >= target){
                        ans = Math.min(ans, (windowEnd - windowSt+1));
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
}
