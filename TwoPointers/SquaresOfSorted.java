package TwoPointers;

import java.util.*;
public class SquaresOfSorted {
    public static int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int n = nums.length-1;
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int sq1 = nums[left] * nums[left];
            int sq2 = nums[right] * nums[right];
            if(sq1 > sq2){
                res[n--] = sq1;
                left++;
            }else{
                res[n--] = sq2;
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-4, 1,2,3};
        int ans[] = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));
    }
}
