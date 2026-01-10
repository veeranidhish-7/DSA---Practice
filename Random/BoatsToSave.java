package Random;

import java.util.*;
class BoatsToSave {
    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                boats++;
                left++;
                right--;
            }else{
                boats++;
                right--;
            }
        }
        return boats;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,1};
        System.out.println(numRescueBoats(arr, 3));
    }
}
