package Random;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = nums1.length;
        int m = nums2.length;

        int nums[] = new int[m+n];
        int len = nums.length;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                nums[k++] = nums1[i++];
            }else{
                nums[k++] = nums2[j++];
            }
        }
        while(i < n){
            nums[k++] = nums1[i++];
        }
        while(j < m){
            nums[k++] = nums2[j++];
        }
        if(nums.length % 2 == 0){
            double a = nums[len/2];
            double b = nums[len/2 - 1];
            System.out.println(a + " " + b);
            double ans = ( a+b )/2;
            return ans;
        }else{
            return nums[len/2];
        }
    }
}
