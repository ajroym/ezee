package org.majr.parser;

import java.util.Arrays;

public class RotateCounterClockwise {

    /*
        Just get algorithm in place and consider PNG
        or BMP specifications more later.
     */
    public static byte[] rotate(byte[] pixelData,
                                String fileType,
                                byte bitDepth,
                                int width,
                                int height) {
        byte[] rotatedPixelData = new byte[pixelData.length];
        Arrays.fill(rotatedPixelData, (byte)0);

        //Placeholder
        int RGB = 3;

        int i = 0;
        int columnToStart = (height * width * RGB) - (height * RGB);
        while (i < pixelData.length) {

            i += 3;
        }

        return null;
    }
}
