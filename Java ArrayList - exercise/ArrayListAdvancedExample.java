import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAdvancedExample {
    public static void main(String[] args) {

        // 1. Створення ArrayList і додавання кольорів
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Червоний");
        colors.add("Синій");
        colors.add("Зелений");
        colors.add("Жовтий");
        System.out.println("Початковий список: " + colors);

        // 2. Сортування списку
        Collections.sort(colors);
        System.out.println("Відсортований список: " + colors);

        // 3. Копіювання списку
        @SuppressWarnings("unchecked")
        ArrayList<String> colorsCopy = (ArrayList<String>) colors.clone();
        System.out.println("Копія списку: " + colorsCopy);

        // 4. Реверсування елементів
        Collections.reverse(colors);
        System.out.println("Реверсований список: " + colors);

        // 5. Порівняння двох списків
        boolean areEqual = colors.equals(colorsCopy);
        System.out.println("Списки colors і colorsCopy однакові? " + areEqual);

        // 6. Очищення списку
        colorsCopy.clear();
        System.out.println("colorsCopy після clear(): " + colorsCopy);

        // 7. Перевірка, чи список порожній
        System.out.println("colorsCopy порожній? " + colorsCopy.isEmpty());
        System.out.println("colors порожній? " + colors.isEmpty());

        // 8. Збільшення розміру списку
        colors.ensureCapacity(10); // гарантовано мінімальна місткість 10
        System.out.println("Збільшено місткість colors до щонайменше 10");

        // 9. Обрізання місткості до фактичного розміру
        colors.trimToSize();
        System.out.println("colors після trimToSize(): " + colors);

        // Додатково: ітерація по списку
        System.out.println("Ітерація по colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
