import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Укажите количество элементов в массиве: ");
            int size = input.nextInt();
            
            if (size == 0) {
                throw new ArithmeticException();
            }
            
            int[] arr = new int[size];
            
            System.out.println("Заполните массив:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = input.nextInt();
            }
            
            System.out.print("\nВаш массив: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            
            int total = 0;
            for (int num : arr) {
                total += num;
            }
            
            double result = (double) total / arr.length;
            System.out.println("\nСреднее арифметическое элементов массива = " + result);
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода: необходимо вводить целые числа.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: введен неверный индекс массива.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: невозможно вычислить среднее для пустого массива.");
        } finally {
            input.close();
        }
    }
}
