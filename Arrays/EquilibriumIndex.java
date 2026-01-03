package Arrays;

public class EquilibriumIndex {
    public static int equilibriumIndex(int[] nums) {
        int tot = 0;
        for(int i = 0; i<nums.length; i++){
            tot+= nums[i];
        }
        int left = nums[0];
        tot -= nums[0];
        for(int i = 1; i<nums.length-1; i++){
            tot -= nums[i];
            if(left == tot){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3};
        System.out.println(equilibriumIndex(arr));
    }
}
