public class Main {
    public static void main(String[] args) {
        // Создаём хэш-таблицу: ключи - строки, значения - целые числа
        HashTable<String, Integer> ht = new HashTable<>(10);

        // Добавляем несколько пар: предмет -> количество страниц
        ht.put("math", 120);
        ht.put("physics", 95);
        ht.put("biology", 80);

        // Показываем размер
        System.out.println("Размер таблицы после добавления: " + ht.size());

        // Получаем и выводим значения
        System.out.println("Страниц в 'math': " + ht.get("math"));
        System.out.println("Страниц в 'physics': " + ht.get("physics"));

        // Обновляем значение по ключу
        ht.put("math", 130);
        System.out.println("'math' после обновления: " + ht.get("math"));

        // Попытка получить несуществующий ключ
        System.out.println("Страниц в 'history' (если нет): " + ht.get("history"));

        // Удаляем 'physics'
        ht.remove("physics");
        System.out.println("Размер после удаления 'physics': " + ht.getSize());

        // Проверяем, пуста ли таблица
        System.out.println("Таблица пуста? " + ht.isEmpty());

        // Добавляем ещё одну запись
        ht.put("history", 60);
        System.out.println("Новый размер: " + ht.size());
        System.out.println("Страниц в 'history': " + ht.get("history"));
    }
}
