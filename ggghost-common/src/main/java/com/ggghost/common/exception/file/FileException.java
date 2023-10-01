package com.ggghost.common.exception.file;

import com.ggghost.common.exception.base.BaseException;

/**
 * @author ggghost
 * @create 2023/9/21 22:38
 */
public class FileException extends BaseException
{
    private static final Long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }
}
