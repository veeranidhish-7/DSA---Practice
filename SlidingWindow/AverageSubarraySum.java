package SlidingWindow;

public class AverageSubarraySum {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n < k) return -1;
        double ans = 0;
        for(int i = 0; i<k; i++){
            ans+= nums[i];
        }
        ans = ans/k;
        double temp = ans;
        int left = 0;
        for(int i = k; i<n; i++){
            temp = temp * k;
            temp -= nums[left++];
            temp += nums[i];
            temp = temp/k;
            ans = Math.max(temp,ans);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,-1,3,-5,-6,20,-7};
        System.out.println(findMaxAverage(arr, 4));
    }
}
