package Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+2];
        for(int i = 0; i<n; i++){
            if(nums[i] > n+1 || nums[i] < 0) continue;
            arr[nums[i]] = 1;
        }
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,4,3};
        System.out.println(firstMissingPositive(arr));
    }
}
