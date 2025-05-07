package files.text;

import files.File;

public class Text extends File {
    private String content;

    public Text(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public long getSize() {
        return content.length();  // 1 символ = 1 байт (условно)
    }
}
