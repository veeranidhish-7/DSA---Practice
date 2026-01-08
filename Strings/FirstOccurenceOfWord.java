package Strings;

public class FirstOccurenceOfWord {
    public int strStr(String haystack, String needle) {
        // int n = haystack.length();
        // if(needle.length() == 0) return -1;
        // for(int i = 0; i<n; i++){
        //     if(haystack.charAt(i) == needle.charAt(0)){
        //         int st = 0;
        //         int a = i;
        //         while(st != needle.length()&& a < n){
        //             if(haystack.charAt(a) != needle.charAt(st)){
        //                 break;
        //             }
        //             a++; st++;
        //         }
        //         if(st == needle.length()) return i;
        //     }
        // }
        // return -1;

        return haystack.indexOf(needle);
    }
}
