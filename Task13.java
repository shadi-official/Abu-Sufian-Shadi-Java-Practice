import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        String paragraph = "A Core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                           "If I buy the laptop and 1 piece of mouse, what will be my total cost after giving 15% discount?";
        
       
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(paragraph);
        
        List<Integer> prices = new ArrayList<>();
        while (m.find()) {
            prices.add(Integer.parseInt(m.group()));
        }
        
        double laptopPrice = prices.get(1);
        double mousePrice = prices.get(2);
        
        double totalCost = laptopPrice + mousePrice;
        double finalCost = totalCost - (totalCost * 0.15);
        
        System.out.printf("Output: %,.0f tk\n", finalCost);
    }
}
