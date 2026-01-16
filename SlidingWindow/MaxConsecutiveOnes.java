package SlidingWindow;

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int windowSt = 0;
        int windowEnd = 0;
        int ans = 0;
        int arr[] = new int[2];
        int maxOccur = 0;

        for(windowEnd = 0; windowEnd < nums.length; windowEnd++){
            arr[nums[windowEnd]]++;
            maxOccur = Math.max(maxOccur,arr[1]);
            while(windowEnd - windowSt + 1 - maxOccur > k){
                arr[nums[windowSt]]--;
                windowSt++;
            }
            ans = Math.max(ans, windowEnd - windowSt + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,0,0,1,1,0,1,0,1,1,1};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
}
