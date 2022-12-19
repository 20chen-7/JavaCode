import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SmallestKNum {
    public List<Integer> getLeastNumbers_Solution(int[] input, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int x: input){
            heap.add(x);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++){
            res.add(heap.remove());
        }
        return res;
    }
}
