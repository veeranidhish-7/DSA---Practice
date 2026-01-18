package SlowFastPointers;

public class Happy {
    public static int square(int num){
        int ans = 0;
        while(num > 0){
            ans += (num%10)*(num%10);
            num = num/10;
        }
        return ans;
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(isHappy(n));
    }
}
