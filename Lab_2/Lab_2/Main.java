package Lab_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объекты
        Sphere sphere1 = new Sphere("Sphere", "White", "Student", 5.3, "m", 10.0, 4.0, 4.0);
        Parallelepiped parallelepiped1 = new Parallelepiped("Parallelepiped", "Black", "Student", 10.0, "m", 4.0, 3.0, 5.0);
        Cylinder cylinder1 = new Cylinder("Cylinder", "Red", "Student", 10.5, "m", 5.0, 4.0, "Silver");

        // === Демонстрация полиморфизма ===
        Geometricfigure[] figures = { sphere1, parallelepiped1, cylinder1 };
        System.out.println("=== ПОЛИМОРФИЗМ: все фигуры ===");
        for (Geometricfigure fig : figures) {
            fig.getInfo();
            System.out.printf("Volume = %.3f%n", fig.volume());
        }

        // === Методы Sphere ===
        System.out.println("--- Методы Sphere ---");
        System.out.println("Исходный радиус: " + sphere1.getRadius());
        sphere1.scale(1.5); // увеличим шар на 50%
        System.out.println("Новый радиус: " + sphere1.getRadius());
        System.out.printf("Новый объём: %.3f%n%n", sphere1.volume());

        // === Методы Parallelepiped ===
        System.out.println("--- Методы Parallelepiped ---");
        System.out.println("Информация о параллелепипеде:");
        parallelepiped1.getInfo();
        System.out.printf("Диагональ параллелепипеда: %.3f%n", parallelepiped1.spaceDiagonal());
        parallelepiped1.setHeight(10.0);
        System.out.printf("Новый объём: %.3f%n%n", parallelepiped1.volume());

        // === Методы Cylinder ===
        System.out.println("--- Методы Cylinder ---");
        System.out.println("Материал цилиндра: " + cylinder1.getMaterial());
        System.out.printf("Объём цилиндра: %.3f%n", cylinder1.volume());
        cylinder1.setMaterial("Алюминий");
        System.out.println("Материал изменён на: " + cylinder1.getMaterial());

        // === Счетчик ===
        System.out.println("\nСоздано тел: " + Solid.getSolidCount());
    }
}
