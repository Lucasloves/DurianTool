package com.github.Lucasloves.file;

import java.io.File;
import java.io.FileNotFoundException;

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

    /**
     *
     * @param file 文件
     * @return 将指定文件转换为byte[]
     * @throws FileNotFoundException
     */
    byte[] getBytes(File file) throws FileNotFoundException;

    /**
     *
     * @param bfile 字节数组
     * @param file 目标文件
     * @return 返回字节数组对应的文件
     */
    File getFile(byte[] bfile,File file);

    /**
     *
     * @param length 切分长度
     * @param file 待分割文件
     * @return 二维字节数组
     */
    byte[][] cutFile(int length, File file);
}
