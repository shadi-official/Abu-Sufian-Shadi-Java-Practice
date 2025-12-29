public class Task04 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 4, 5};
        int n = 5; 
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("Output: " + missingNumber);
    }
}
