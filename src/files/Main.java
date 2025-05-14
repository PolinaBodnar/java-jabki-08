package files;

public class Main {
    public static long totalSize(File[] files) {
        long total = 0;
        for (File file : files) {
            total += file.getSize();
        }
        return total;
    }

    public static void main(String[] args) {
        File[] files = {
                new Text("notes.txt", "Интерфейсы и абстрактные классы"),
                new Image("photo.jpg", 1920, 1080, 3),
                new Text("todo.txt", "Урок по java, №8")
        };

        System.out.println("Размер файла: " + totalSize(files) + " bytes");
    }
}
