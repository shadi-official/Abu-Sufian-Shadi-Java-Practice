import java.util.HashSet;
import java.util.Set;

public class Task07 {
    public static void main(String[] args) {
        String input = "abcaabbcc";
        
        Set<Character> uniqueChars = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        
        System.out.print("Unique characters: ");
        int count = 0;
        for (Character c : uniqueChars) {
            System.out.print(c + (count < uniqueChars.size() - 1 ? ", " : ""));
            count++;
        }
        
        System.out.println("\nTotal unique characters: " + uniqueChars.size());
    }
}
