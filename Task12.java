public class Task12 {
    public static void main(String[] args) {
        String example1 = "1001";
        String example2 = "2001";

        System.out.println("Example 1: " + example1 + " -> " + isValidBinary(example1));
        System.out.println("Example 2: " + example2 + " -> " + isValidBinary(example2));
    }

    public static boolean isValidBinary(String str) {
      
        return str.matches("[01]+");
    }
}
