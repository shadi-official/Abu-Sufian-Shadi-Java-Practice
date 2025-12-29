public class Task15 {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int targetMarks = 100;
        for (int x = 0; x <= totalQuestions; x++) {
            int y = totalQuestions - x;
            
            if ((x * 5) + (y * 10) == targetMarks) {
                System.out.println("5-mark questions: " + x);
                System.out.println("10-mark questions: " + y);
                break; 
            }
        }
    }
}
