public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) sum += numbers[i];
        }
        System.out.println("Output: " + sum);
    }
}
