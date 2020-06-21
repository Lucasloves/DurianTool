package com.github.Lucasloves.file;

import java.io.File;

/**
 * @author: Cynaith
 **/
public interface FileCommand {
    /**
     *
     * @param file 文件
     * @return 返回字面大小
     */
    String getPrintSize(File file);
}
