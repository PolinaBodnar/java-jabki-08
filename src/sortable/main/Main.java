package sortable.main;

import sortable.Sortable;
import sortable.models.Person;
import sortable.models.FileSize;

public class Main {
    public static void main(String[] args) {
        Sortable[] people = {
                new Person(30),
                new Person(25),
                new Person(40)
        };

        System.out.println("Перед сортировкой:");
        for (Sortable s : people) System.out.println(s);

        sortArray(people);

        System.out.println("После сортировки:");
        for (Sortable s : people) System.out.println(s);

        Sortable[] files = {
                new FileSize(500),
                new FileSize(200),
                new FileSize(1000)
        };

        System.out.println("\nПеред сортировкой:");
        for (Sortable s : files) System.out.println(s);

        sortArray(files);

        System.out.println("После сортировки:");
        for (Sortable s : files) System.out.println(s);
    }

    public static void sortArray(Sortable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compare(arr[j + 1]) > 0) {
                    Sortable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
