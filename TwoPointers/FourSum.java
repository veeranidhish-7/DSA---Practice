package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j>i+1&&nums[j] == nums[j-1]) continue; // This was the troubled condition
                int left = j+1;
                int right = n-1;
                while(left < right){
                    long sum  = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]); list.add(nums[j]);
                        list.add(nums[left]); list.add(nums[right]);
                        ans.add(list);

                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        int target = 0;
        System.out.println(fourSum(arr, target));
    }
}
