package org.majr.format;

import java.util.HexFormat;

public class PortableNetworkGraphics {

    private int WIDTH;
    private int HEIGHT;
    private byte BIT_DEPTH;
    private byte COLOR_TYPE;
    private byte COMPRESSION_METHOD;
    private byte FILTER_METHOD;

    private final byte[] PLTE;
    private final byte[] IDAT;

    private static byte[] SIGNATURE = HexFormat.of().parseHex("89 50 4e 47 0d 0a 1a 0a");
    private static byte[] IEND = HexFormat.of().parseHex("49 45 4e 44 ae 42 60 82");

    public PortableNetworkGraphics() {
        this.PLTE = new byte[]{};
        this.IDAT = new byte[]{};
    }

}
