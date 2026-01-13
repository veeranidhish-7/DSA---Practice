package SlidingWindow;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int left = 0;
        int ans = nums[0];
        int temp = 0;
        int st = 0;
        int tempSt = 0;
        int end = 0;
        for(int i = 0; i<nums.length; i++){
            temp += nums[i];
            if(temp > ans){
                ans = temp;
                st = tempSt;
                end = i;
            }
            if(temp < 0){
                temp = 0;
                tempSt = i+1;
            }
        }
        // st and end are starting and ending indices of maximum subarray
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
