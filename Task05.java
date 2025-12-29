import java.util.LinkedHashMap;
import java.util.Map;

public class Task05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        
        Map<Integer, Integer> occurrences = new LinkedHashMap<>();
        
        for (int num : numbers) {
            if (occurrences.containsKey(num)) {
                
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                
                occurrences.put(num, 1);
            }
        }
        
        
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
