import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*";
        String all = upper + lower + digits + special;
        
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
  
        password.append(upper.charAt(rand.nextInt(upper.length())));
        password.append(lower.charAt(rand.nextInt(lower.length())));
        password.append(digits.charAt(rand.nextInt(digits.length())));
        password.append(special.charAt(rand.nextInt(special.length())));
      
        for(int i = 4; i < 8; i++) {
            password.append(all.charAt(rand.nextInt(all.length())));
        }
        
        System.out.println("Generated Password: " + password.toString());
    }
}
