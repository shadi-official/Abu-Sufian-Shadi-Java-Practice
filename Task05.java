public class Task05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyDone = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyDone = true;
                    break;
                }
            }
            if (!alreadyDone) {
                int count = 0;
                for (int num : numbers) {
                    if (num == numbers[i]) count++;
                }
                System.out.println(numbers[i] + ": " + count);
            }
        }
    }
}
