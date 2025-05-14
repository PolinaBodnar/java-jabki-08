package sortable;

public class FileSize implements Sortable {
    private long size;

    public FileSize(long size) {
        this.size = size;
    }

    @Override
    public int compare(Sortable other) {
        if (!(other instanceof FileSize)) throw new IllegalArgumentException("Incompatible types");
        FileSize o = (FileSize) other;
        return Long.compare(this.size, o.size);
    }

    @Override
    public String toString() {
        return "FileSize (size=" + size + ")";
    }
}
