package org.majr.file;

import org.majr.exceptions.InvalidFormatException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageFile {

    private static final short MIN_PATH_LENGTH = 5;

    public static byte[] extract(String pathStr) throws IOException {
        Path path = Path.of(pathStr);
        if (!doesPathExist(path)) {
            throw new FileNotFoundException();
        }

        if (!isValidImageFormat(pathStr.substring(pathStr.length() - 4))) {
            throw new InvalidFormatException("Invalid format requested at " +
                                            pathStr +
                                            "\n\nPlease enter a file of one of the following formats: .bpm, .png");
        }
        return Files.readAllBytes(path);
    }

    private static boolean isValidImageFormat(String fileExtension) {
        return fileExtension.equals(".bmp") ||
                fileExtension.equals(".png");
    }

    private static boolean doesPathExist(Path path) {
        return path != null && path.toString().length() > MIN_PATH_LENGTH && Files.exists(path);
    }
}
