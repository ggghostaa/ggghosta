package com.ggghost.common.exception.file;


import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 文件上传异常类
 * @author ggghost
 * @create 2023/9/22 21:44
 */
public class FileUploadException extends Exception {
    private static final long serialVersionUID = 1L;

    private final Throwable cause;

    public FileUploadException() {
        this(null, null);
    }

    public FileUploadException(String msg, Throwable cause) {
        super((msg));
        this.cause = cause;
    }

    public FileUploadException(final String msg) {
        this(msg, null);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
        if (cause != null) {
            s.println("Caused by:");
            cause.printStackTrace(s);
        }
    }

    @Override
    public void printStackTrace(PrintWriter writer) {
        super.printStackTrace(writer);
        if (cause != null) {
            writer.println("Caused by:");
            cause.printStackTrace(writer);
        }
    }

    @Override
    public Throwable getCause() {
        return cause;

    }
}
