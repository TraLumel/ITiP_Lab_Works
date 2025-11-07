import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите имя исходного файла: ");
        String sourceFile = scanner.nextLine();
        
        System.out.print("Введите имя файла назначения: ");
        String destFile = scanner.nextLine();
        
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destFile)) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            System.out.println("Файл успешно скопирован!");
            
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
