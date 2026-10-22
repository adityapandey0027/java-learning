import java.util.*;

public class InsertIntervals {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Intervals");
        int n = sc.nextInt();

        int [][] intervals = new int[n][2];

        for(int i =0; i<n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.print("Enter new intervals");
        int [] newInterval = new int[2];
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();

        int [][] result = insertIntervals(intervals, newInterval);
        printIntervals(result);

        sc.close();

    }
    static int [][] insertIntervals(int [][] intervals, int [] newInterval){
        int n = intervals.length;
        List<int [] > list = new ArrayList<>();
        int i = 0;

        while(i < n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        while(i < n && intervals[i][1] <  newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        list.add(newInterval);

        while(i < n){
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
        
        
    }
    static void printIntervals(int [][] intervals){

        for(int i =0; i<intervals.length; i++){
            System.out.print("["+ intervals[i][0] +", "+intervals[i][1] + "]" +" ");
        }
    }
}
