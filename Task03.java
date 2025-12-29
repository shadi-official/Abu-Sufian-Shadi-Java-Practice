import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};
        
        
        HashSet<Integer> uniqueSet = new HashSet<>();
        int sum = 0;
        
        for (int num : numbers) {
            
            if (uniqueSet.add(num)) {
                sum += num;
            }
        }
        
        System.out.println("Output: " + sum);
    }
}
