package sortable.main;

import sortable.Sortable;
import sortable.models.Person;
import sortable.models.FileSize;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sortable[] people = {
                new Person(30),
                new Person(25),
                new Person(40)
        };

        System.out.println("Перед сортировкой:");
        for (Sortable s : people) {
            System.out.println(s);
        }

        sortArray(people);

        System.out.println("После сортировки:");
        for (Sortable s : people) {
            System.out.println(s);
        }

        Sortable[] files = {
                new FileSize(500),
                new FileSize(200),
                new FileSize(1000)
        };

        System.out.println("\nПеред сортировкой:");
        for (Sortable s : files) {
            System.out.println(s);
        }

        sortArray(files);

        System.out.println("После сортировки:");
        for (Sortable s : files) {
            System.out.println(s);
        }
    }

    // Метод для сортировки
    public static void sortArray(Sortable[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new IllegalArgumentException("Элемент с индексом " + i + " равен null.");
            }
        }

        Arrays.sort(array, Sortable::compare);
    }
}
