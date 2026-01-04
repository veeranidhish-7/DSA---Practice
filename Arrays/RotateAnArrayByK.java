package Arrays;

public class RotateAnArrayByK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        k = n-k;
        int arr[] = new int[n];
        int j = 0;
        for(int i = k; i<n; i++){
            arr[j++] = nums[i];
        }
        for(int i = 0; i<k; i++){
            arr[j++] = nums[i];
        }
        for(int i = 0; i<n; i++){
            nums[i] = arr[i];
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        rotate(arr, k);
        printArr(arr);
    }
}
