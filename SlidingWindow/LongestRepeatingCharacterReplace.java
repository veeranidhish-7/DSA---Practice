package SlidingWindow;

public class LongestRepeatingCharacterReplace {
    public static int characterReplacement(String s, int k) {
        int windowSt = 0;
        int windowEnd = 0;
        int ans = 0;
        int charFreq[] = new int[26];
        int maxOccur = 0;

        for(windowEnd = 0; windowEnd<s.length(); windowEnd++){
            charFreq[s.charAt(windowEnd) - 'A']++;
            maxOccur = Math.max(maxOccur, charFreq[s.charAt(windowEnd) - 'A']);

            if(windowEnd - windowSt + 1 - maxOccur > k){
                charFreq[s.charAt(windowSt) - 'A']--;
                windowSt++;
            }

            ans = Math.max(ans, windowEnd - windowSt+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "AAAABBVCDEEBBBESAAA";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
