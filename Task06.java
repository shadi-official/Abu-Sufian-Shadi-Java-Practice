import java.util.HashMap;
import java.util.Map;

public class Task06 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int num : numbers) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getKey());
                first = false;
            }
        }
    }
}
