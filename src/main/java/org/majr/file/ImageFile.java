package org.majr.file;

import java.nio.file.Path;

public class ImageFile {

    private final Path path;

    public ImageFile(String path) {
        this.path = Path.of(path);
    }

    public byte[] extract() {
        return null;
    }
}
