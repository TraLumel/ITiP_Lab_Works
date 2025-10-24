public class Main {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        directory.addStudent("2023001", new Student("Ivan", "Ivanov", 20, 4.5));
        directory.addStudent("2023002", new Student("Petr", "Petrov", 21, 4.0));
        directory.addStudent("2023003", new Student("Anna", "Sidorova", 19, 4.8));

        directory.printAllStudents();

        System.out.println("Размер: " + directory.size());
        directory.deleteStudent("2023002");
        System.out.println("После удаления 2023002:");
        directory.printAllStudents();
        System.out.println("Поиск студента по номеру 2023001: " + directory.findStudent("2023001"));
    }
}
