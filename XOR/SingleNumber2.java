package XOR;
import java.util.*;

public class SingleNumber2 {
    public static int[] singleNumber(int[] nums) {
        if(nums.length == 2) return nums;

        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            temp ^=nums[i];
        }

        int right = 1;
        while((right & temp) == 0){
            right = right << 1;
        }

        int num1 = 0; int num2 = 0;
        for(int num : nums){
            if((num & right) == 0){
                num1 ^= num;
            }else{
                num2 ^= num;
            }
        }

        return new int[] {num1,num2};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(arr)));
    }
}
