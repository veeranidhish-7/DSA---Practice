package Arrays;

public class ReverseStringWords {
    public static String reverse(String x){
        String words[] = x.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i>0) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String x = "The         sky is in blue colour";
        System.out.println(reverse(x));
    }
}
