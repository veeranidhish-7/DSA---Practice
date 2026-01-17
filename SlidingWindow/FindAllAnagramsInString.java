package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        int windowSt = 0;
        int windowEnd = 0;
        int matchCount = 0;
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i<p.length(); i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        for(windowEnd = 0; windowEnd <s.length(); windowEnd++){
            if(map.containsKey(s.charAt(windowEnd))){
                map.put(s.charAt(windowEnd),map.get(s.charAt(windowEnd)) - 1);
                if(map.get(s.charAt(windowEnd)) == 0) matchCount++;
            }
            int len = windowEnd - windowSt + 1;
            if(len > p.length()){
                char st = s.charAt(windowSt);
                windowSt++;
                if(map.containsKey(st)){
                    if(map.get(st) == 0) matchCount--;
                    map.put(st,map.get(st)+1);
                }
            }
            if(matchCount == map.size()){
                list.add(windowSt);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
