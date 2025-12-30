public class Task06 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        boolean first = true;

        System.out.print("Output: ");
        
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
        
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > 1) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (numbers[i] == numbers[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(numbers[i]);
                    first = false;
                }
            }
        }
    }
}
