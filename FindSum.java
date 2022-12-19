import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindSum {
    public int[] findNumbersWithSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int x: nums){
            int y = target-x;
            if (set.contains(y)){
                return new int[]{y,x};
            }else{
                set.add(x);
            }
        }return null;

    }
}
