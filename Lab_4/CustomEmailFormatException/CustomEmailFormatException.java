public class CustomEmailFormatException extends Exception {
    private String emailValue;
    
    public CustomEmailFormatException(String emailValue) {
        super("Ошибка: неверный формат email");
        this.emailValue = emailValue;
    }
    
    public String getEmailValue() {
        return emailValue;
    }
}
