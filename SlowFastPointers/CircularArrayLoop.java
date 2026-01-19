package SlowFastPointers;

import java.util.HashSet;
import java.util.Set;

public class CircularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        Set<Integer> set;
        int n = nums.length;
        int ind = 0;

        for(int i = 0; i<n; i++){
            ind = i;
            set = new HashSet<>();
            set.add(i);
            boolean dir = (nums[ind] > 0);
            while(true){
                if((nums[ind] > 0) != dir){
                    break;
                }
                int nextInd = (((ind + nums[ind]) % n) + n )%n;
                if(nextInd == ind){
                    break;
                }
                ind = nextInd;
                if(!set.add(ind)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[] = {2,-1,1,2,2};
        int arr2[] = {-1,-2,-3,-4,-5,6};
        System.out.println(circularArrayLoop(arr1));
        System.out.println(circularArrayLoop(arr2));
    }
}
