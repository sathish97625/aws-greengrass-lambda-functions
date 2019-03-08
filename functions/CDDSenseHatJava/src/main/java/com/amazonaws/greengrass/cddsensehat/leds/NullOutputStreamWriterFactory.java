package com.amazonaws.greengrass.cddsensehat.leds;

import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * Created by timmatt on 2/24/17.
 */
public class NullOutputStreamWriterFactory implements OutputStreamWriterFactory {
    @Override
    public OutputStreamWriter get(File file, Charset charset) {
        return new OutputStreamWriter(new OutputStream() {
            @Override
            public void write(int b) {
            }
        });
    }
}
