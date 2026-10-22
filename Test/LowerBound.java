import java.util.*;

public class LowerBound {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] nums = {10, 20, 30, 50, 55};

        System.out.println("Enter target value");
        int target = sc.nextInt();

        System.out.println(lowerBoundIdx(nums, target));
    }

    public static int lowerBoundIdx(int [] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int mid = low + (high - low ) / 2;
        int ans = nums.length;

        while(low <= high){
            mid = low + (high - low ) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }

        return ans;
    }
}
