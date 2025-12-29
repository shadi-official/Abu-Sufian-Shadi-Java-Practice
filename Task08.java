import java.util.ArrayList;
import java.util.List;

public class Task08 {
    static int count = 0;

    public static void main(String[] args) {
        String str = "cat";
        System.out.print("Permutations: ");
        printPermutations(str, "");
        System.out.println("\nTotal permutations: " + count);
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + (count > 0 ? "" : "") + " ");
            count++;
            return;
        }

        for (int i = 0; i < str.length(); i++) {
           
            char ch = str.charAt(i);

           
            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutations(ros, ans + ch);
        }
    }
}
