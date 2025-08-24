package org.majr.file;

import org.majr.exceptions.InvalidFormatException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageFile {

    public static byte[] extract(String pathStr) throws IOException {
        try {
            if (!isValidImageFormat(pathStr.substring(pathStr.length() - 5))) {
                throw new InvalidFormatException("Invalid format requested at " +
                                                pathStr +
                                                "\n\nPlease enter a file of one of the following formats: .bpm, .png");
            }
            return Files.readAllBytes(Path.of(pathStr));

        } catch(OutOfMemoryError memError) {
            System.out.println();

            return null;
        } catch (InvalidFormatException formatError) {
            System.out.println(formatError.getMessage());

            return null;
        }
    }

    private static boolean isValidImageFormat(String fileExtension) {
        return fileExtension.equals(".bmp") ||
                fileExtension.equals(".png");
    }
}
