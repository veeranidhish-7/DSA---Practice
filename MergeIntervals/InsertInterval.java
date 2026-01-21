package MergeIntervals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int []> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while(i < n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        list.add(newInterval);

        while(i < n){
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()-1][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
}
