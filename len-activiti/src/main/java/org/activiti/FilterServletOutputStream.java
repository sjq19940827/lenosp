package org.activiti;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

public class FilterServletOutputStream extends ServletOutputStream {

    private DataOutputStream stream;

    public FilterServletOutputStream(OutputStream output) {
        stream = new DataOutputStream(output);
    }

    /**
     * @param b
     * @throws IOException
     */
    @Override
    public void write(int b) throws IOException {
        stream.write(b);
    }

    /**
     * @param b
     * @throws IOException
     */
    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);
    }

    /**
     * @param b
     * @param off
     * @param len
     * @throws IOException
     */
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }

    /**
     * @param writeListener
     */
    @Override
    public void setWriteListener(WriteListener writeListener) {
        WriteListener writeListener1 = writeListener;
    }

    /**
     * @return
     */
    @Override
    public boolean isReady() {
        return true;
    }
}