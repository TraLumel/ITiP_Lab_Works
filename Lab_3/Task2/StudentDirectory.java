import java.util.HashMap;
import java.util.Map;

// Упрощённый класс для хранения студентов по номеру зачетки
public class StudentDirectory {
    private Map<String, Student> students;

    public StudentDirectory() {
        students = new HashMap<>();
    }

    // Вставка или обновление студента по номеру зачетки
    public void addStudent(String recordBookNumber, Student student) {
        students.put(recordBookNumber, student);
    }

    // Поиск студента по номеру зачетки
    public Student findStudent(String recordBookNumber) {
        return students.get(recordBookNumber);
    }

    // Удаление студента по номеру зачетки
    public void deleteStudent(String recordBookNumber) {
        students.remove(recordBookNumber);
    }

    // Печать всех студентов (номер -> студент)
    public void printAllStudents() {
        for (Map.Entry<String, Student> e : students.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public int size() { return students.size(); }
    public boolean isEmpty() { return students.isEmpty(); }
}
