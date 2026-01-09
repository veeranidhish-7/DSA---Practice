package Strings;

public class RotatedString {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String n = s+s;
        int i = n.indexOf(goal);
        if(i>=0) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
