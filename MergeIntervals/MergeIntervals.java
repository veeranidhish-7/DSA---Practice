package MergeIntervals;
import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int intervals[][]){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int[] nextInterval : intervals){
            int end = currentInterval[1];
            int nextSt = nextInterval[0];
            int nextEnd = nextInterval[1];

            if(nextSt <= end){
                currentInterval[1] = Math.max(end,nextEnd);
            }else{
                currentInterval = nextInterval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()-1][]);
    }

    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int result[][] = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
