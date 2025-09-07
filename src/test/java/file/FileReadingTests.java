package file;

import org.junit.jupiter.api.Test;
import org.majr.exceptions.InvalidFormatException;
import org.majr.file.ImageFile;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class FileReadingTests {

    @Test
    void invalidFileExceptionTest() {
        assertThrows(InvalidFormatException.class, () -> ImageFile.extract("src/test/resources/cat.jpg"));
        assertThrows(FileNotFoundException.class, () -> ImageFile.extract(""));
        assertThrows(FileNotFoundException.class, () -> ImageFile.extract("a"));
    }

    @Test
    void fileDoesNotExistExceptionTest() {
        assertThrows(FileNotFoundException.class, () -> ImageFile.extract("src/test/resources/none.png"));
    }

    @Test
    void validFileDoesNotThrowException() {
        assertDoesNotThrow(() -> ImageFile.extract("src/test/resources/dove.png"));
        assertDoesNotThrow(() -> ImageFile.extract("src/test/resources/test.bmp"));
    }
}
