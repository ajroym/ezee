package org.majr.format;

public class Bitmap {

    private int WIDTH;

    private int HEIGHT;

    private int COMPRESSION_METHOD;

    private short COLOR_DEPTH;

    private final short COLOR_PLANES = 1;

    private final byte[] PIXEL_ARRAY;

    private final byte[] COLOR_TABLE;

    public Bitmap() {
        this.PIXEL_ARRAY = new byte[] {};
        this.COLOR_TABLE = new byte[] {};
    }
}
