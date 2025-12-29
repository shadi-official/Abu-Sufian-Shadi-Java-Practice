public class Task11 {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        
        String result = input.replaceAll("(?i)[aeiou]", "");
        result = result.replaceAll("\\s+", " ").trim();
        
        System.out.println("Output: " + result.toLowerCase());
    }
}
