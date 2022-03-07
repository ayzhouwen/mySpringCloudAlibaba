package com.jyzn.common.core.exception.file;

import com.jyzn.common.core.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author jyzn
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
