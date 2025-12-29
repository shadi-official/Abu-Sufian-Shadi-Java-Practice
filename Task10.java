public class Task10 {
    public static void main(String[] args) {
        String input = "s@atur!day";
    
        String result = input.replaceAll("[^a-zA-Z]", "");
        
        System.out.println("Output: " + result);
    }
}
