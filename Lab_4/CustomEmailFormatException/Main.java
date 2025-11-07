import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите email: ");
        String userInput = scanner.nextLine();
        
        try {
            if (!isValidEmail(userInput)) {
                throw new CustomEmailFormatException(userInput);
            }
            
            System.out.println("Email корректен: " + userInput);
            
        } catch (CustomEmailFormatException e) {
            System.out.println(e.getMessage() + ", введено: " + e.getEmailValue());
            Logger.log(e);
        }
    }
    
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        if (email.startsWith(".")) {
            return false;
        }
        
        if (!email.contains("@")) {
            return false;
        }
        
        int atIndex = email.indexOf("@");
        
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        
        String localPart = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        
        if (localPart.endsWith(".")) {
            return false;
        }
        
        if (!domain.contains(".")) {
            return false;
        }
        
        if (domain.startsWith(".") || domain.endsWith(".")) {
            return false;
        }
        
        if (email.contains(" ")) {
            return false;
        }
        
        return true;
    }
}
