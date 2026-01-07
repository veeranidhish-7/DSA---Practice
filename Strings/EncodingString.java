package Strings;

import java.util.*;
class Solution {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        
        StringBuilder currentString = new StringBuilder();
        int k = 0; // To store the number (multiplier)

        for (char c : s.toCharArray()) {
            
            // Case 1: If it's a digit, build the number (handles multiple digits like "12")
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } 
            
            // Case 2: If '[', we pause. Save current state and reset.
            else if (c == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                
                // Reset for the new section inside brackets
                currentString = new StringBuilder();
                k = 0;
            } 
            
            // Case 3: If ']', we finish the section and combine.
            else if (c == ']') {
                // Pop the string we saved BEFORE the bracket
                StringBuilder decodedString = stringStack.pop();
                
                // Pop the multiplier number
                int currentK = countStack.pop();
                
                // Append the current section 'currentK' times
                for (int i = 0; i < currentK; i++) {
                    decodedString.append(currentString);
                }
                
                // Update currentString to be this combined result
                currentString = decodedString;
            } 
            
            // Case 4: If it's a regular letter, just add to current string
            else {
                currentString.append(c);
            }
        }
        
        return currentString.toString();
    }
    public static void main(String[] args) {
        String s = "3[a2[cd]]ef";
        System.out.println(decodeString(s));
    }
}