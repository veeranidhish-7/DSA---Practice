package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKUniques {
    public static int longestKSubstr(String s, int k) {
        // code here
        int windowSt = 0;
        int windowEnd = 0;
        int ans = -1;
        Map<Character,Integer> map = new HashMap<>();
        int currentLength = 0;
        
        for(windowEnd = 0; windowEnd < s.length(); windowEnd++){
            map.put(s.charAt(windowEnd), map.getOrDefault(s.charAt(windowEnd),0)+1);
            
            if(map.size() >= k){
                
                while(map.size() > k){
                    char curChar = s.charAt(windowSt);
                    int f = map.get(curChar);
                    if(f == 1) map.remove(curChar);
                    else map.put(curChar,f-1);
                    windowSt++;
                }
            }
                currentLength = windowEnd - windowSt +1;
                if(map.size() == k) ans = Math.max(ans, currentLength);
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "aabbccccadefghi";
        System.out.println(longestKSubstr(s, 3));
    }
}
