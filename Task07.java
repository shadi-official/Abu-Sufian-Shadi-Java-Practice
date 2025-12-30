public class Task07 {
    public static void main(String[] args) {
        String input = "abcaabbcc";
        String unique = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (unique.indexOf(c) == -1) {
                unique += c;
            }
        }
        System.out.println("Unique characters: " + unique);
        System.out.println("Total unique characters: " + unique.length());
    }
}
