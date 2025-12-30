public class Task13 {
    public static void main(String[] args) {
        String input = "A Core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
        String currentNum = "";
        double total = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                currentNum += c;
            } else {
                if (!currentNum.isEmpty()) {
                    int val = Integer.parseInt(currentNum);
                    if (val > 10) total += val; 
                    currentNum = "";
                }
            }
        }
        double finalPrice = total - (total * 0.15);
        System.out.println("Output: " + (int)finalPrice + " tk");
    }
}
