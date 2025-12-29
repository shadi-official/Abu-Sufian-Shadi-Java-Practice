public class Task14 {
    public static void main(String[] args) {
        int amount = 546;
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("Output for " + amount + " tk:");
        
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note; 
                amount = amount % note;  
                System.out.println(note + " x " + count);
            }
        }
    }
}
