package files;

public class Image extends File {
    private int width;
    private int height;
    private int bytesPerPixel;

    public Image(String name, int width, int height, int bytesPerPixel) {
        super(name);
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        return (long) width * height * bytesPerPixel;
    }
}
